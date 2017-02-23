package com.leightondarkins.FactoryPattern.PizzaStore;

import com.leightondarkins.FactoryPattern.Pizza.CaliforniaStyleCheesePizza;
import com.leightondarkins.FactoryPattern.Pizza.Pizza;

public class CaliPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new CaliforniaStyleCheesePizza();
        } else {
            return null;
        }
    }
}
