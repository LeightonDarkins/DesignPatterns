package com.leightondarkins.ObserverPattern.HandRolled;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature, humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float airPressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: Temp: " + temperature + ", Humidity: " + humidity);
    }
}
