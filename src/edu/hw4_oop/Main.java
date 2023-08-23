package edu.hw4_oop;

public class Main {
    public static void main(String[] args) {
        Animal rino = new Animal("Rino", "Gray");
//        rino.run();
//        rino.swim();
        Cat mursic = new Cat(new Counter(), "Mursic", "Gray");
        Dog Bobik  = new Dog(new Counter(), "Bobik", "Black");
//        Bobik.run();
//        Bobik.swim();
    }
}
