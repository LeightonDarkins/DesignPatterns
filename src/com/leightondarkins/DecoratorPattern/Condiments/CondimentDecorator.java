package com.leightondarkins.DecoratorPattern.Condiments;

import com.leightondarkins.DecoratorPattern.Beverage;

public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
