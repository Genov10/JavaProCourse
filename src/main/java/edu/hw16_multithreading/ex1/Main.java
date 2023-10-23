package edu.hw16_multithreading.ex1;

import edu.hw16_multithreading.ex1.Cars.Audi;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        ThreadSafeList threadSafeList = new ThreadSafeList();

        final int carCanStart = 8;
        Thread audiStart = new Thread(() -> {
            IntStream.range(0, carCanStart).mapToObj(i -> new Audi(i + 1)).forEach(threadSafeList::add);
        });
        Thread bmwStart = new Thread(() -> {
            IntStream.range(0, carCanStart).mapToObj(i -> new Audi(i + 5)).forEach(threadSafeList::add);
        });
        Thread mercedesStart = new Thread(() -> {
            IntStream.range(0, carCanStart).mapToObj(i -> new Audi(i + 10)).forEach(threadSafeList::add);
        });

        audiStart.start();
        bmwStart.start();
        mercedesStart.start();

        threadSafeList.getParticipant();

        Thread audiRemove = new Thread(() -> {
            IntStream.range(0, carCanStart).map(i -> i + 1).forEach(threadSafeList::remove);
        });

        threadSafeList.getParticipant();
    }
}
