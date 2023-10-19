package edu.hw16_multithreading.ex2;

import java.util.Random;

public class Car {
    private final String brand;

    public Car() {
        final Brands[] brands = Brands.values();
        this.brand = brands[new Random().nextInt(brands.length)].name();
    }


    public String getCarBrand() {
        return brand;
    }
}


enum Brands {
        vovlvo,
        mercedes,
        bmw,
        tesla,
        toyota,
        shkoda,
        honda,
        mazda,
        subaru
}
