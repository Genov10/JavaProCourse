package edu.hw16_multithreading.ex1.Cars;

public abstract class SportCar {
    private int number;

    public SportCar(int number) {
        this.number = number;
    }

    public abstract void drive();

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "number=" + number +
                '}';
    }
}
