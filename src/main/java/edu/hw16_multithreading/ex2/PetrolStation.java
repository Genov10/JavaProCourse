package edu.hw16_multithreading.ex2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

import com.google.common.util.concurrent.AtomicDouble;

public class PetrolStation {
    private static final int AMOUNT_GASOLINE_STATION = 3;
    private AtomicDouble amount;

    private final ExecutorService executor;

    public PetrolStation(double initialFuelAmount) {
        ThreadFactory threadFactory = new ThreadFactory() {
            private int gasolineNum = 1;
            public Thread newThread( Runnable r) {
                return new Thread(r, "GasolineThread-" + gasolineNum++);
            }
        };
        this.amount = new AtomicDouble(initialFuelAmount);
        this.executor = Executors.newFixedThreadPool(AMOUNT_GASOLINE_STATION, threadFactory);
    }

    public void addAmount(double amount) {
        this.amount.addAndGet(amount);
    }

    public void doRefuel(Car car, double fuelAmount) {
        executor.execute(() -> {
            if (amount.updateAndGet(currentAmount -> currentAmount - fuelAmount) >= 0.0) {
                System.out.println(
                        "Refueled " + fuelAmount + " liters petrol for \"" +
                                car.getCarBrand() + "(working gas pump #" + Thread.currentThread().getName() + ")."
                );
                try {
                    Thread.sleep(getLattency() * 1_000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                addAmount(fuelAmount);
                System.out.println("Refueling no longer possible for " + car.getCarBrand() + ". " +
                        "Current fuel balance (" + getAmount() + " liters) less than " + fuelAmount + " liters!");
            }
        });
    }

    public void shutdown() {
        executor.shutdown();
        try {
            if (executor.awaitTermination(Integer.MAX_VALUE, TimeUnit.SECONDS)) {
                System.out.println("Done!\n------\n" +
                        "Current fuel balance at the station: " + amount.get() + " liters.");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private long getLattency() {
        int min = 3;
        int max = 10;
        return (long) (Math.random() * (max - min + 1)) + min;
    }

    public double getAmount() {
        return amount.get();
    }

    public void setAmount(double newAmount) {
        this.amount.set(newAmount);
    }
}
