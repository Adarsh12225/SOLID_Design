package com.birds.birds;

import com.birds.model.Bird;
import com.birds.Capabilty.*;
import com.birds.Behavior.fly.Flybehavior;

public class Eagle extends Bird implements Flyable, Eatable {

    private Flybehavior flyBehavior;

    public Eagle(Flybehavior flyBehavior) {
        super("Eagle", 5, "Dark Brown");
        this.flyBehavior = flyBehavior;
    }

    public void fly() {
        flyBehavior.fly();
    }

    public void eat() {
        System.out.println("Eagle eats meat 🍖");
    }
}