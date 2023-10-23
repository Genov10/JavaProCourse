package edu.hw16_multithreading.ex2;

import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        final int totalCarsForRefuel = 5;
        PetrolStation petrolStation = new PetrolStation(600.0);

        IntStream.range(0, totalCarsForRefuel).forEach(i -> petrolStation.doRefuel(new Car(), getRandomFuelAmount()));

        petrolStation.shutdown();
    }
    private static int getRandomFuelAmount() {
        final int minFuelAmount = 10;
        final int maxFuelAmount = 45;
        return ThreadLocalRandom.current().nextInt(minFuelAmount, maxFuelAmount + 1);
    }
}
