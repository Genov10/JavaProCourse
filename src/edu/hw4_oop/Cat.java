package edu.hw4_oop;

public class Cat extends Animal{
    private final int RUN_LIMIT = 150;

    public Cat(Counter catCounter, String name, String color) {
        super(name, color);
        catCounter.catAdd();
    }

    @Override
    public void run() {
        System.out.println("Enter how many meters " + name + " have to run: ");
        distance += scanner.nextInt();
        if (distance > RUN_LIMIT) {
            System.out.println(name + " is a cat, it cannot do that! It is too far");

        } else if (distance < RUN_LIMIT) {
            runDistance += distance;
            completeDistance += distance;
            distance = 0;
        }
        showDistance(runDistance, swimDistance, completeDistance);
    }

    @Override
    public void swim() {
        System.out.println(name + " is a cat, it cannot swim");
    }

}
