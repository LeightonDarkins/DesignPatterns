package com.leightondarkins.FactoryPattern.SimpleFactory;

import com.leightondarkins.FactoryPattern.Pizza.NYStyleCheesePizza;
import com.leightondarkins.FactoryPattern.Pizza.Pizza;

public class NYPizzaFactory implements IPizzaFactory {
    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else {
            return null;
        }
    }
}
