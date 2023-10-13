package edu.hw16_multithreading.ex1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class TreadSafeList {
    private List<Car> cars;

    public TreadSafeList() {
        cars = new ArrayList<>();
    }
    public void add(Car car){
        cars.add(car);
    }

    public void remove(String name){
        Iterator<Car> carIterator = cars.iterator();
        while (carIterator.hasNext()) {
            Car c = carIterator.next();
            if (c.getName().equals(name)) {
                carIterator.remove();
            }
        }
    }

    public Car get(int index){
        if (index >= 0 && index < cars.size()) {
            return cars.get(index);
        } else {
            return null;
        }
    }

    public void printList() {
        cars.stream().forEach(car -> System.out.println(car.toString()));
    }
}
