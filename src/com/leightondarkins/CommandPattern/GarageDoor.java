package com.leightondarkins.CommandPattern;

public class GarageDoor {
    private boolean isOpen = false;

    public GarageDoor() {}

    public void up() {
        isOpen = true;
    }

    public void down() {
        isOpen = false;
    }

    public boolean isOpen() {
        return isOpen;
    }
}
