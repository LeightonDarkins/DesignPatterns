package com.leightondarkins.FactoryPattern.SimpleFactory;

public class NYPizzaFactory implements IPizzaFactory {
    public SimpleFactoryPizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else {
            return null;
        }
    }
}
