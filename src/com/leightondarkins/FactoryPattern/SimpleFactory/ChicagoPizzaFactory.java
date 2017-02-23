package com.leightondarkins.FactoryPattern.SimpleFactory;

public class ChicagoPizzaFactory implements IPizzaFactory {
    @Override
    public SimpleFactoryPizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else {
            return null;
        }
    }
}
