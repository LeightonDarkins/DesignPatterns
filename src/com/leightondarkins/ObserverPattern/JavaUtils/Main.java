package com.leightondarkins.ObserverPattern.JavaUtils;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(30.5f, 0.65f, 30.6f);
        weatherData.setMeasurements(10f, 0, 1000);
        weatherData.setMeasurements(25, 0.15f, 500);
    }
}
