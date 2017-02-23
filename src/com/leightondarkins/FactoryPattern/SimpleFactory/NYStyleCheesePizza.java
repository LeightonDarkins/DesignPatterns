package com.leightondarkins.FactoryPattern.SimpleFactory;

public class NYStyleCheesePizza extends SimpleFactoryPizza {
    public NYStyleCheesePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Parmesan Cheese");
    }
}
