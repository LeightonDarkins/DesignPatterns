package com.leightondarkins.FactoryPattern.SimpleFactory;

import com.leightondarkins.FactoryPattern.Pizza.ChicagoStyleCheesePizza;
import com.leightondarkins.FactoryPattern.Pizza.Pizza;

public class ChicagoPizzaFactory implements IPizzaFactory {
    @Override
    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else {
            return null;
        }
    }
}
