package edu.hw4_oop;

public class Dog extends Animal{
    private final int RUN_LIMIT = 200;
    private final int SWIM_LIMIT = 10;
    private int dogCounter;
    public Dog() {
        dogCounter++;
    }
    public Dog(String name, String color) {
        super(name, color);
    }


    @Override
    public void run() {
        System.out.println("Enter how many meters " + name + " have to run: ");
        distance += scanner.nextInt();
        if (distance > RUN_LIMIT) {
            System.out.println(name + " is a dog, it cannot do that! It is too far");

        } else if (distance < RUN_LIMIT) {
            runDistance += distance;
            completeDistance += distance;
            distance = 0;
        }
        showDistance(runDistance, swimDistance, completeDistance);
    }

    @Override
    public void swim() {
        System.out.println("Enter how many meters " + name + " have to swim: ");
        distance += scanner.nextInt();
        if (distance > SWIM_LIMIT) {
            System.out.println(name + " is a dog, it cannot do that! It is too far");

        } else if (distance < SWIM_LIMIT) {
            swimDistance += distance;
            completeDistance += distance;
            distance = 0;
        }
        showDistance(runDistance, swimDistance, completeDistance);
    }

    public int getDogCounter() {
        return dogCounter;
    }

    public void setDogCounter(int dogCounter) {
        this.dogCounter = dogCounter;
    }
}
