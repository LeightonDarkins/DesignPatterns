package com.leightondarkins.StrategyPattern.Behaviours.Quack;

public class MuteQuack implements QuackBehaviour {

    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
