package com.leightondarkins.FactoryPattern.Pizza;

import java.util.ArrayList;

public abstract class Pizza {
    String name, dough, sauce;
    ArrayList<String> toppings = new ArrayList<>();

    public void prepare() {
        System.out.println(String.format("Preparing %s", name));
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings...");

        for (String topping : toppings) {
            System.out.println(String.format("\t%s", topping));
        }
    }

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
}
