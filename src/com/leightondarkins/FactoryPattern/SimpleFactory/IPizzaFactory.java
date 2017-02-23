package com.leightondarkins.FactoryPattern.SimpleFactory;

import com.leightondarkins.FactoryPattern.Pizza.Pizza;

public interface IPizzaFactory {
    Pizza createPizza(String type);
}
