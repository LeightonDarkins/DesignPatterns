package com.leightondarkins.SingletonPattern;

public class ThreadSafeSingleton {
    private volatile static ThreadSafeSingleton uniqueInstance;

    private ThreadSafeSingleton() { }

    public static ThreadSafeSingleton getInstance () {
        if (uniqueInstance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new ThreadSafeSingleton();
                }
            }

        }

        return uniqueInstance;
    }
}