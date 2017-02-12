package com.leightondarkins.StrategyPattern;

import com.leightondarkins.StrategyPattern.Behaviours.Fly.FlyRocketPowered;

public class Main {

    public static void main(String[] args) {
	    Duck mallard = new MallardDuck();
	    mallard.display();
	    mallard.performQuack();
	    mallard.performFly();
	    mallard.swim();

	    System.out.println("========================");

	    Duck model = new ModelDuck();
	    model.display();
	    model.performQuack();
	    model.performFly();
	    model.setFlyBehaviour(new FlyRocketPowered());
	    model.performFly();
	    model.swim();

        System.out.println("========================");

	    DuckCall duckCall = new DuckCall();
	    duckCall.performQuack();
    }
}
