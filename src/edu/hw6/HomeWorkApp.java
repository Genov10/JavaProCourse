package edu.hw6;

import java.util.Random;
import java.util.Scanner;

public class HomeWorkApp {
    public static void main(String[] args) {
        Random random = new Random();
        Methods method = new Methods();

        method.printThreeWords();

        method.checkSumSign();

        method.printColor();

        method. compareNumbers();

        final int MAX_VALUE = 20;
        final int MIN_VALUE = -10;
        final int a = random.nextInt(MIN_VALUE, MAX_VALUE);
        final int b = random.nextInt(MIN_VALUE, MAX_VALUE);
        boolean res = method.checkSumInRange(a, b);
        System.out.println(res);

        method.isValuePositive(a);

        boolean res2 = method.isValuePositive2(a);
        System.out.println(res2);

        String message = "Message";
        method.printMessage(message, a);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = scanner.nextInt();
        method.leapYear(year);
    }
}
