package edu.hw16_multithreading.ex1;

public class Main {
    public static void main(String[] args) {
        TreadSafeList cars = new TreadSafeList();
        cars.add(new Car("Lamborgini", "Red", 2));
        cars.add(new Car("Toyota", "Black", 5));
        cars.add(new Car("Audi", "Gray", 5));
        cars.printList();

        cars.remove("Lamborgini");
        cars.printList();

        System.out.println(cars.get(1));
    }
}
