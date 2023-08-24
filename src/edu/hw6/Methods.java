package edu.hw6;

import java.util.Random;
import java.util.Scanner;

public class Methods {
//2
    public static void printThreeWords() {
        System.out.println("Apple\nOrange\nBanana");
    }
//3
    public static void checkSumSign() {
        Random random = new Random();
        final int MAX_VALUE = 10;
        final int MIN_VALUE = -10;
        final int a = random.nextInt(MIN_VALUE, MAX_VALUE);
        final int b = random.nextInt(MIN_VALUE, MAX_VALUE);
        if (a + b >= 0) {
            System.out.println("-----------------------\n" + a + ", " + b + "\nSum: " + (a + b) + "\nSum is positive");
        }else {
            System.out.println("-----------------------\n" + a + ", " + b + "\nSum: " + (a + b) + "\nSum is negative");
        }
    }
//4
    public static void printColor() {
        Random random = new Random();
        final int MAX_VALUE = 200;
        final int MIN_VALUE = -100;
        final int value = random.nextInt(MIN_VALUE, MAX_VALUE);
        System.out.println("-----------------------");
        if (value <= 0) {
            System.out.println("Red");
        } else if (value >= 0 && value <= 100) {
            System.out.println("Yellow");
        } else {
            System.out.println("Green");
        }
    }
//5
    public static void compareNumbers() {
        Random random = new Random();
        final int MAX_VALUE = 10;
        final int MIN_VALUE = -10;
        final int a = random.nextInt(MIN_VALUE, MAX_VALUE);
        final int b = random.nextInt(MIN_VALUE, MAX_VALUE);
        System.out.println("-------------------");
        if (a > b) {
            System.out.println(a + " > " + b);
        }else if (a == b){
            System.out.println(a + " = " + b);
        } else {
            System.out.println(a + " < " + b);
        }
    }
//    6
    public static boolean checkSumInRange(int a, int b) {
        System.out.println("---------------------------");
        int res = a + b;
        return res >= 10 && res <= 20;
    }
//    7

    public static void isValuePositive(int a) {
        System.out.println("---------------------------");
        if (a >= 0) {
            System.out.println(a + " is positive");
        } else {
            System.out.println(a + " is negative");
        }
    }
//8
    public static boolean isValuePositive2(int a) {
        return a <= 0;
    }
//9
    public static void printMessage(String a, int b) {
        System.out.println("----------------------");
        for (int i = 0; i <= b; i++) {
            System.out.println(a + b);
        }
    }
    //10
    public static void leapYear(int year) {
        System.out.println("-----------------------------");
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                System.out.println(year + " is leap");
            } else {
                System.out.println(year + " is not leap");
            }
    }
}
