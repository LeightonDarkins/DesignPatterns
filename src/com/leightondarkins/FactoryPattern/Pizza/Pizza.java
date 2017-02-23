package com.leightondarkins.FactoryPattern.Pizza;

import com.leightondarkins.FactoryPattern.PizzaIngredient.*;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clam clams;

    public abstract void prepare();

    public void box() {
        System.out.println("Place pizza in official pizza store box");
    }

    public void bake() {
        System.out.println("Bake for 25 minutes at 350f");
    }

    public void cut() {
        System.out.println("Cut pizza into diagonal slices");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
