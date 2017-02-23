package com.leightondarkins.FactoryPattern.SimpleFactory;

public class ChicagoStyleCheesePizza extends SimpleFactoryPizza {
    public ChicagoStyleCheesePizza() {
        name = "Chicago Style, Deep Dish Cheese Pizza";
        dough = "Deep Dish Dough";
        sauce = "Rich Tomato Sauce";

        toppings.add("Mozzarella Cheese");
    }
}
