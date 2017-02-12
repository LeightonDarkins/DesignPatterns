package com.leightondarkins.ObserverPattern.JavaUtils;

import java.util.Observable;

public class WeatherData extends Observable {
    private float temperature, humidity, airPressure;

    public WeatherData() {

    }

    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float airPressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.airPressure = humidity;

        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getAirPressure() {
        return airPressure;
    }
}
