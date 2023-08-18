package edu.hw4_oop;

import java.util.Scanner;

public class Animal {
    protected String name;
    protected String color;
    protected int distance;
    protected int runDistance;
    protected int swimDistance;
    protected int completeDistance;
    Scanner scanner = new Scanner(System.in);
    private static int animalCounter;
    public Animal() {
        animalCounter++;
    }

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void run(){
        System.out.println("Enter how many meters " + name + " have to run: ");
        distance += scanner.nextInt();
        runDistance += distance;
        completeDistance += distance;
        distance = 0;
        showDistance(runDistance, swimDistance, completeDistance);
    }

    public void swim(){
        System.out.println("Enter how many meters " + name + " have to swim: ");
        distance += scanner.nextInt();
        swimDistance += distance;
        completeDistance += distance;
        distance = 0;
        showDistance(runDistance, swimDistance, completeDistance);
    }

    public void showDistance(int runDistance, int swimDistance, int completeDistance) {
        System.out.println(name + " has covered " + completeDistance + " meters. " + runDistance + " running and " + swimDistance + " swimming.");
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static int getAnimalCounter() {
        return animalCounter;
    }

    public static void setAnimalCounter(int animalCounter) {
        Animal.animalCounter = animalCounter;
    }
}
