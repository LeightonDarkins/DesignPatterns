package com.leightondarkins.StrategyPattern;

public class UnsafeSingleton {
    private static UnsafeSingleton uniqueInstance;

    private UnsafeSingleton() { }

    public static UnsafeSingleton getInstance () {
        if (uniqueInstance === null) {
            uniqueInstance = new UnsafeSingleton()
        }

        return uniqueInstance
    }
}