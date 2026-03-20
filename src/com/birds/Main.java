package com.birds;

import com.birds.birds.*;
import com.birds.Behavior.fly.Fastfly;

public class Main {
    public static void main(String[] args) {

        Sparrow sparrow = new Sparrow(new Fastfly());
        Eagle eagle = new Eagle(new Fastfly());
        Parrot parrot = new Parrot(new Fastfly());

        Penguin penguin = new Penguin();
        Ostrich ostrich = new Ostrich();

        System.out.println("\n--- Sparrow ---");
        sparrow.displayInfo();
        sparrow.fly();
        sparrow.eat();

        System.out.println("\n--- Eagle ---");
        eagle.displayInfo();
        eagle.fly();
        eagle.eat();

        System.out.println("\n--- Parrot ---");
        parrot.displayInfo();
        parrot.fly();
        parrot.eat();

        System.out.println("\n--- Penguin ---");
        penguin.displayInfo();
        penguin.swim();
        penguin.eat();

        System.out.println("\n--- Ostrich ---");
        ostrich.displayInfo();
        ostrich.eat();
    }
}