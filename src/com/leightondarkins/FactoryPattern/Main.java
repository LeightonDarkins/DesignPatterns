package com.leightondarkins.FactoryPattern;

import com.leightondarkins.FactoryPattern.Pizza.Pizza;
import com.leightondarkins.FactoryPattern.PizzaStore.CaliPizzaStore;
import com.leightondarkins.FactoryPattern.PizzaStore.ChicagoPizzaStore;
import com.leightondarkins.FactoryPattern.PizzaStore.NYPizzaStore;
import com.leightondarkins.FactoryPattern.SimpleFactory.ChicagoPizzaFactory;
import com.leightondarkins.FactoryPattern.SimpleFactory.IPizzaFactory;
import com.leightondarkins.FactoryPattern.SimpleFactory.NYPizzaFactory;
import com.leightondarkins.FactoryPattern.SimpleFactory.Store;

public class Main {
    public static void main(String[] args) {
        factoryPizzas();
        simpleFactoryPizzas();
    }

    public static void factoryPizzas() {
        print("\n========= FACTORY PIZZAS ==========\n");

        NYPizzaStore nyPizzaStore = new NYPizzaStore();
        ChicagoPizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        CaliPizzaStore caliPizzaStore = new CaliPizzaStore();

        Pizza nyPizza = nyPizzaStore.orderPizza("cheese");
        Pizza chicagoPizza = chicagoPizzaStore.orderPizza("cheese");
        Pizza caliPizza = caliPizzaStore.orderPizza("cheese");

        print(String.format("I ordered a %s", nyPizza.getName()));
        print(String.format("I ordered a %s", chicagoPizza.getName()));
    }

    public static void simpleFactoryPizzas() {
        print("\n======= SIMPLE FACTORY PIZZAS ========\n");

        IPizzaFactory nyPizzaFactory = new NYPizzaFactory();
        Store nyPizzaStore = new Store(nyPizzaFactory);
        Pizza nyPizza = nyPizzaStore.orderPizza("cheese");

        IPizzaFactory chicagoPizzaFactory = new ChicagoPizzaFactory();
        Store chicagoPizzaStore = new Store(chicagoPizzaFactory);
        Pizza chicagoPizza = chicagoPizzaStore.orderPizza("cheese");

        print(String.format("I ordered a %s", nyPizza.getName()));
        print(String.format("I ordered a %s", chicagoPizza.getName()));
    }

    public static void print(String text) {
        System.out.println(text);
    }
}
