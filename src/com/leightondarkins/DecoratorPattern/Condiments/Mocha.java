package com.leightondarkins.DecoratorPattern.Condiments;

import com.leightondarkins.DecoratorPattern.Beverage;

public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Mocha";
    }

    public double cost() {
        return this.beverage.cost() + .20;
    }
}
