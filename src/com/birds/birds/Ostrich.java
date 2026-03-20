package com.birds.birds;

import com.birds.model.Bird;
import com.birds.Capabilty.*;

public class Ostrich extends Bird implements Eatable {

    public Ostrich() {
        super("Ostrich", 100, "Black");
    }

    public void eat() {
        System.out.println("Ostrich eats plants 🌿");
    }
}