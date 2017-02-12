package com.leightondarkins.StrategyPattern;

import com.leightondarkins.StrategyPattern.Behaviours.Fly.FlyWithWings;
import com.leightondarkins.StrategyPattern.Behaviours.Quack.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real, Mallard Duck!");
    }
}
