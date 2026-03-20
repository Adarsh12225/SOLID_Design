package com.birds.birds;

import com.birds.Capabilty.Eatable;
import com.birds.model.Bird;
import com.birds.Capabilty.*;

public class Penguin extends Bird implements Swimable, Eatable {

    public Penguin() {
        super("Penguin", 15, "Black & White");
    }

    public void swim() {
        System.out.println("Penguin swims 🐧");
    }

    public void eat() {
        System.out.println("Penguin eats fish 🐟");
    }
}