package com.clownfish7.observer.improve;

import java.util.List;


/**
 * @author You
 * @create 2019-07-27 17:59
 */
public class WeatherData implements Subject {

    private float temperatrue;
    private float pressure;
    private float humidity;
    private List<Observer> observers;
    //加入新的第三方

    public WeatherData(List<Observer> observers) {
        this.observers = observers;
    }

    public float getTemperature() {
        return temperatrue;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void dataChange() {
//        //调用 接入方的 update
//        for (Observer observer : observers) {
//            observer.update(getTemperature(), getPressure(), getHumidity());
//        }
    }

    //当数据有更新时，就调用 setData
    public void setData(float temperature, float pressure, float humidity) {
        this.temperatrue = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        //调用dataChange， 将最新的信息 推送给 接入方 currentConditions
        dataChange();
    }

    @Override
    public void registerObserver(Observer observcer) {
        observers.add(observcer);
    }

    @Override
    public void removeObserver(Observer observcer) {
        observers.remove(observcer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(getTemperature(), getPressure(), getHumidity());
        }
    }
}
