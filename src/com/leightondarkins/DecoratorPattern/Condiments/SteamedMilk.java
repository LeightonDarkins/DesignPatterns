package com.leightondarkins.DecoratorPattern.Condiments;

import com.leightondarkins.DecoratorPattern.Beverage;

public class SteamedMilk extends CondimentDecorator {
    Beverage beverage;

    public SteamedMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Steamed Milk";
    }

    public double cost() {
        return this.beverage.cost() + .10;
    }
}
