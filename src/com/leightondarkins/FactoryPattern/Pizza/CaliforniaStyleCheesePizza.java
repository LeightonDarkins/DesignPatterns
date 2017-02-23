package com.leightondarkins.FactoryPattern.Pizza;

public class CaliforniaStyleCheesePizza extends Pizza {
    public CaliforniaStyleCheesePizza() {
        name = "California Style Faux Cheese Pizza";
        dough = "Cardboard";
        sauce = "Lima Bean Juice";

        toppings.add("Sustainably sourced moon cheese");
    }
}
