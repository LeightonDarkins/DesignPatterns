package com.leightondarkins.StrategyPattern;

import com.leightondarkins.StrategyPattern.Behaviours.Quack.Quack;
import com.leightondarkins.StrategyPattern.Behaviours.Quack.QuackBehaviour;

public class DuckCall {
    QuackBehaviour quackBehaviour;

    public DuckCall() {
        quackBehaviour = new Quack();
    }

    public void performQuack() {
        quackBehaviour.quack();
    }
}
