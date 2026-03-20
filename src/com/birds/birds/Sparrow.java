package com.birds.birds;

import com.birds.Behavior.fly.Flybehavior;
import com.birds.Capabilty.*;
import com.birds.Capabilty.Flyable;
import com.birds.model.Bird;

public class Sparrow extends Bird implements Flyable, Eatable {
private Flybehavior flyBehavior;

public Sparrow(Flybehavior flyBehavior) {
    super("Sparrow", 2, "Brown");
    this.flyBehavior = flyBehavior;
}

public void fly() {
    flyBehavior.fly();
}

public void eat() {
    System.out.println("Sparrow eats grains 🌾");
}
}