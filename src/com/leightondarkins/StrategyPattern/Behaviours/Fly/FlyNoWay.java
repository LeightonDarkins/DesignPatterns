package com.leightondarkins.StrategyPattern.Behaviours.Fly;

public class FlyNoWay implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("Nope!");
    }
}
