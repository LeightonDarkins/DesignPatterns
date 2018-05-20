package com.leightondarkins.CommandPattern;

public class Light {
    private boolean isOn = false;

    public Light () {}

    public void on() {
        this.isOn = true;
    }

    public void off() {
        this.isOn = false;
    }

    public boolean isOn() {
        return isOn;
    }
}
