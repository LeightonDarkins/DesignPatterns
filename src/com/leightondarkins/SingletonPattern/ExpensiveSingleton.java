package com.leightondarkins.SingletonPattern;

public class ExpensiveSingleton {
    private static ExpensiveSingleton uniqueInstance;

    private ExpensiveSingleton() { }

    public static synchronized ExpensiveSingleton getInstance () {
        if (uniqueInstance == null) {
            uniqueInstance = new ExpensiveSingleton();
        }

        return uniqueInstance;
    }
}