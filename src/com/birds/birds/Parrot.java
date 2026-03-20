package com.birds.birds;

import com.birds.model.Bird;
import com.birds.Capabilty.*;
import com.birds.Behavior.fly.Flybehavior;

public class Parrot extends Bird implements Flyable, Eatable {

    private Flybehavior flyBehavior;

    public Parrot(Flybehavior flyBehavior) {
        super("Parrot", 1, "Green");
        this.flyBehavior = flyBehavior;
    }

    public void fly() {
        flyBehavior.fly();
    }

    public void eat() {
        System.out.println("Parrot eats fruits 🍎");
    }
}