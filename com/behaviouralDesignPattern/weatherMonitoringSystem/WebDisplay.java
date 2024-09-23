package com.behaviouralDesignPattern.weatherMonitoringSystem;

public class WebDisplay implements Observer {
    @Override
    public void update(float temperature, float humidity) {
        System.out.println("Web Display: Temp: " + temperature + "°C, Humidity: " + humidity + "%");
    }
}

