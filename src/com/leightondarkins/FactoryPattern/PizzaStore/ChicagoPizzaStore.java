package com.leightondarkins.FactoryPattern.PizzaStore;

import com.leightondarkins.FactoryPattern.Pizza.ChicagoStyleCheesePizza;
import com.leightondarkins.FactoryPattern.Pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else {
            return null;
        }
    }
}
