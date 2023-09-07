package edu.hw8_exeptions;

public class Main {
    public static void main(String[] args) {
        ArrayValueCalculator arrayValueCalculator = new ArrayValueCalculator();

        String[][] arr1 = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}};//4x4 correct
        String[][] arr2 = {{"1", "2q", "3", "4", "9"}, {"5", "6", "7", "8", "10"}};//have not int
        String[][] arr3 = {{"1", "2", "3", "4", "9"}, {"5", "6", "7", "8", "10", "11"}};//5x6 incorrect

        arrayValueCalculator.doCalc(arr1);
        arrayValueCalculator.doCalc(arr2);
        arrayValueCalculator.doCalc(arr3);
    }
}
