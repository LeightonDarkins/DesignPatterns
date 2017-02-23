package com.leightondarkins.FactoryPattern.PizzaStore;

import com.leightondarkins.FactoryPattern.Pizza.*;
import com.leightondarkins.FactoryPattern.PizzaIngredient.NYPizzaIngredientFactory;
import com.leightondarkins.FactoryPattern.PizzaIngredient.PizzaIngredientFactory;

public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();

        if (type.equals("cheese")) {
            pizza = new CheesePizza(pizzaIngredientFactory);
            pizza.setName("NY Style Cheese Pizza");
        } else if (type.equals("clam")) {
            pizza = new ClamPizza(pizzaIngredientFactory);
            pizza.setName("NY Style Clam Pizza");
        }

        return pizza;
    }
}
