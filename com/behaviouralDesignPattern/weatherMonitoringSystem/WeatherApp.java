package com.behaviouralDesignPattern.weatherMonitoringSystem;

import java.util.Scanner;

public class WeatherApp {
    public static void main(String[] args) {
        WeatherStation weatherStation = WeatherStation.getInstance();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose display (1: Phone, 2: Web): ");
        int choice = scanner.nextInt();
        if (choice == 1) {
            weatherStation.registerObserver(new PhoneDisplay());
        } else if (choice == 2) {
            weatherStation.registerObserver(new WebDisplay());
        }

        // Simulating weather data update
        weatherStation.setWeatherData(25.0f, 65.0f);
        weatherStation.setWeatherData(30.0f, 70.0f);

        scanner.close();
    }
}
