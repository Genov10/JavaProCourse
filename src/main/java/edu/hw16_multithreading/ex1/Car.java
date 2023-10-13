package edu.hw16_multithreading.ex1;

public class Car {
    private String name;
    private String color;
    private int passengerAmount;

    public Car(String name, String color, int passengerAmount) {
        this.name = name;
        this.color = color;
        this.passengerAmount = passengerAmount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPassengerAmount() {
        return passengerAmount;
    }

    public void setPassengerAmount(int passengerAmount) {
        this.passengerAmount = passengerAmount;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", passengerAmount=" + passengerAmount +
                '}';
    }
}
