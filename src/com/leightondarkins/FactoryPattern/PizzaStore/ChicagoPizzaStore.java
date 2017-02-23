package com.leightondarkins.FactoryPattern.PizzaStore;

import com.leightondarkins.FactoryPattern.Pizza.CheesePizza;
import com.leightondarkins.FactoryPattern.Pizza.Pizza;
import com.leightondarkins.FactoryPattern.PizzaIngredient.ChicagoPizzaIngredientFactory;
import com.leightondarkins.FactoryPattern.PizzaIngredient.PizzaIngredientFactory;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new ChicagoPizzaIngredientFactory();

        if (type.equals("cheese")) {
            pizza = new CheesePizza(pizzaIngredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");
        }

        return pizza;
    }
}
