package edu.hw16_multithreading.ex2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PetrolStation {
    private static final int AMOUNT_GASOLINE_STATION = 3;
    private volatile double amount;
    private final Thread[] threads;
    private final Lock lock;

    public PetrolStation(double initialFuelAmount) {
        this.amount = initialFuelAmount;
        this.threads = new Thread[AMOUNT_GASOLINE_STATION];
        this.lock = new ReentrantLock();
    }

    public void addAmount(double amount) {
        this.amount += amount;
    }

    public void doRefuel(Car car, double fuelAmount) {
        lock.lock();
        try {
            if (amount - fuelAmount >= 0.0) {
                System.out.println(
                        "Refueled " + fuelAmount + " liters petrol for " + car.getCarBrand()
                );
                try {
                    Thread.sleep(getLattency() * 1_00);
                } catch (InterruptedException e) {
                    //e.printStackTrace();
                }
                amount -= fuelAmount;
            } else {
                addAmount(fuelAmount);
                System.out.println("Refueling no longer possible for \"" + car.getCarBrand() +
                        "Current fuel balance (" + getAmount() + " liters) less than " + fuelAmount + " liters!");
            }
        } finally {
            lock.unlock();
        }
    }

    public void shutdown() {
        for (Thread thread : threads) {
            if (thread != null) {
                thread.interrupt();
            }
        }
    }

    private long getLattency() {
        int min = 3;
        int max = 10;
        return (long) (Math.random() * (max - min + 1)) + min;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double newAmount) {
        this.amount = newAmount;
    }
}
