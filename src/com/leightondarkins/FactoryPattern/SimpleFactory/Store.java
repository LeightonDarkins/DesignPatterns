package com.leightondarkins.FactoryPattern.SimpleFactory;

public class Store {
    IPizzaFactory factory;

    public Store(IPizzaFactory factory) {
        this.factory = factory;
    }

    public SimpleFactoryPizza orderPizza(String type) {
        SimpleFactoryPizza pizza = factory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

}
