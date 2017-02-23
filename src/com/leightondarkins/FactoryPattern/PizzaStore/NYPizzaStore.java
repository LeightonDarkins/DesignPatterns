package com.leightondarkins.FactoryPattern.PizzaStore;

import com.leightondarkins.FactoryPattern.Pizza.NYStyleCheesePizza;
import com.leightondarkins.FactoryPattern.Pizza.NYStylePepperoniPizza;
import com.leightondarkins.FactoryPattern.Pizza.Pizza;

public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (type.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        } else {
            return null;
        }
    }
}
