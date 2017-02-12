package com.leightondarkins.StrategyPattern;

import com.leightondarkins.StrategyPattern.Behaviours.Fly.FlyNoWay;
import com.leightondarkins.StrategyPattern.Behaviours.Quack.MuteQuack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        quackBehaviour = new MuteQuack();
        flyBehaviour = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("I'm a Model Duck!");
    }
}
