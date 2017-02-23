package com.leightondarkins.FactoryPattern.SimpleFactory;

import com.leightondarkins.FactoryPattern.Pizza.Pizza;

public class Store {
    IPizzaFactory factory;

    public Store(IPizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza = factory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

}
