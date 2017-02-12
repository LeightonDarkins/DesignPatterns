package com.leightondarkins.StrategyPattern.Behaviours.Quack;

public class Quack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("QUACK!");
    }
}
