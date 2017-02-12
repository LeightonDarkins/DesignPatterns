package com.leightondarkins.DecoratorPattern.Condiments;

import com.leightondarkins.DecoratorPattern.Beverage;

public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Whip";
    }

    public double cost() {
        return this.beverage.cost() + .10;
    }
}
