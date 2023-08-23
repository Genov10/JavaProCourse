package edu.hw4_oop;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Animal rino = new Animal( counter,"Rino", "Gray");
        rino.run();
        rino.swim();
        Cat mursic = new Cat(counter, "Mursic", "Gray");
        mursic.run();
        mursic.swim();
        Cat pussInBoots = new Cat(counter, "Puss In Boots", "Gray");
        pussInBoots.run();
        pussInBoots.swim();
        Dog Bobik  = new Dog(counter, "Bobik", "Black");
        Bobik.run();
        Bobik.swim();
        System.out.println("There are " + counter.getCatsCount() + " cat, " + counter.getDogsCount() + " dog, and " + counter.getAnimalsCount() + " other." + "\n" + counter.getTotalCount() + " at all.");

    }
}
