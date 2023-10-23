package edu.hw16_multithreading.ex1;

import edu.hw16_multithreading.ex1.Cars.SportCar;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ThreadSafeList {
    private List<SportCar> sportCars;

    public ThreadSafeList() {
        sportCars = new ArrayList<>();
    }
    public void add(SportCar sportCar){
        sportCars.add(sportCar);
    }

    public void remove(int numberOfCar){
        Iterator<SportCar> carIterator = sportCars.iterator();
        while (carIterator.hasNext()) {
            SportCar sc = carIterator.next();
            if (sc.getNumber() == numberOfCar) {
                carIterator.remove();
            }
        }
    }



    public void getParticipant() {
        sportCars.stream()
                .mapToInt(SportCar::getNumber)
                .mapToObj(number -> number + ",")
                .forEach(System.out::print);
        System.out.println();
    }
}
