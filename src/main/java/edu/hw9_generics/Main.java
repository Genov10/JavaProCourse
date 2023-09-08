package edu.hw9_generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Box<Apple> appleBox1 = new Box<>();
        Box<Apple> appleBox2 = new Box<>();
        Box<Orange> orangeBox2 = new Box<>();

        Apple apple1 = new Apple();
        List<Apple> appleList = new ArrayList<>();
        appleList.add(new Apple());
        appleList.add(new Apple());

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();

        appleBox1.addOneFruit(apple1);
        System.out.println(appleBox1.getListOfFruits());
        appleBox1.addSomeFruits(appleList);
        System.out.println(appleBox1.getTotalWeight());
        System.out.println(appleBox1.compare(appleBox2));
        System.out.println(appleBox1.compare(orangeBox2));
        appleBox1.merge(new Box<>());
    }
}
