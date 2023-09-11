package edu.hw9_generics;

import java.util.ArrayList;
import java.util.List;

public class Box <T extends Fruit>{
    private List<T> listOfFruits = new ArrayList<T>();
    private double totalWeight;
    public void addOneFruit(T t){
        this.listOfFruits.add(t);
    }

    public void addSomeFruits(List<T> t){
        this.listOfFruits.addAll(t);
    }

    public boolean compare(Box<? extends Fruit> newBox){
        return getTotalWeight() == newBox.getTotalWeight();
    }

    public void merge(Box<T> newBox) {
        if (this != newBox) {
            listOfFruits.addAll(newBox.getListOfFruits());
            newBox.getListOfFruits().clear();
            System.out.println("The first basket is empty and second is full!");
        }
    }

    public List<T> getListOfFruits() {
        return listOfFruits;
    }

    public double getTotalWeight(){
        for (int i = 0; i < listOfFruits.toArray().length; i++) {
            totalWeight += i;
        }
        System.out.println("Total weight of your basket is " + totalWeight);
        return totalWeight;
    }


}
