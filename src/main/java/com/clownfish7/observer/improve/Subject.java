package com.clownfish7.observer.improve;

/**
 * @author You
 * @create 2019-07-27 17:57
 */
public interface Subject {
    public void registerObserver(Observer observcer);
    public void removeObserver(Observer observcer);
    public void notifyObservers();
}
