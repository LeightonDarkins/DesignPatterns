package com.leightondarkins.DecoratorPattern.Condiments;

import com.leightondarkins.DecoratorPattern.Beverage;

public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Soy";
    }

    public double cost() {
        return this.beverage.cost() + .15;
    }
}
