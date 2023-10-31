package edu.hw20_patterns.Factory.Furniture;


public class Chair implements Furniture {
    public Chair() {
        System.out.println("A chair was created");
    }

    public void check() {
        System.out.println("the chair is ok");
    }
}
