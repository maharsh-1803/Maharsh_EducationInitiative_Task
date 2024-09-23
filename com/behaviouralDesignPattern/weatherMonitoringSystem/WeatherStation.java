package com.behaviouralDesignPattern.weatherMonitoringSystem;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation {
    private static WeatherStation instance;
    private List<Observer> observers = new ArrayList<>();
    private float temperature;
    private float humidity;

    private WeatherStation() {}

    public static synchronized WeatherStation getInstance() {
        if (instance == null) {
            instance = new WeatherStation();
        }
        return instance;
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setWeatherData(float temperature, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity);
        }
    }
}

