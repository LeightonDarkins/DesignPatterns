package com.leightondarkins.FactoryPattern.Pizza;

public class NYStylePepperoniPizza extends Pizza {
    public NYStylePepperoniPizza() {
        name = "New York Style Pepperoni Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Parmesan Cheese");
        toppings.add("Pepperoni");
    }
}
