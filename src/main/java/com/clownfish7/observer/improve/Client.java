package com.clownfish7.observer.improve;

import java.util.ArrayList;

/**
 * @author You
 * @create 2019-07-27 18:10
 */
public class Client {
    public static void main(String[] args) {
        CurrentConditions currentConditions = new CurrentConditions();
        WeatherData weatherData = new WeatherData(new ArrayList<>());
        weatherData.registerObserver(currentConditions);
        weatherData.setData(1f, 1f, 11f);

        Sina sina = new Sina();
        weatherData.registerObserver(sina);

        weatherData.notifyObservers();
        System.out.println("==========================");
        System.out.println("==========================");

        weatherData.removeObserver(currentConditions);

        weatherData.setData(2f, 2f, 222f);
        weatherData.notifyObservers();

    }
}
