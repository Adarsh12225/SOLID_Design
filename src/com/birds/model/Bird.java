package com.birds.model;

public abstract class Bird {
    protected String name;
    protected int weight;
    protected String color;
    public Bird(String name, int weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
    }
    public void Displayinfo(){
        System.out.println("Name: " + name+ "weight"+ weight+"color"+color);
    }

    public void displayInfo() {
    }
}