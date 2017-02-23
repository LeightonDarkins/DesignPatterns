package com.leightondarkins.FactoryPattern.SimpleFactory;

public interface IPizzaFactory {
    SimpleFactoryPizza createPizza(String type);
}
