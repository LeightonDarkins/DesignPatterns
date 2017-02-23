package com.leightondarkins.FactoryPattern.Pizza;

public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        name = "Chicago Style, Deep Dish Cheese Pizza";
        dough = "Deep Dish Dough";
        sauce = "Rich Tomato Sauce";

        toppings.add("Mozzarella Cheese");
    }
}
