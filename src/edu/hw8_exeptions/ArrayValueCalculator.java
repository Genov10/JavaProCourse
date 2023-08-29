package edu.hw8_exeptions;

import edu.hw8_exeptions.NewExceptions.ArrayDataException;
import edu.hw8_exeptions.NewExceptions.ArraySizeException;

public class ArrayValueCalculator {
    public static void doCalc (String[][] arr)  {
        System.out.println(sumIntInString(arr));
        isArrSizeIncorrect(arr);

    }

    public static void isArrSizeIncorrect(String[][] arr) throws ArraySizeException{
        final int CORRECT_SIZE = 4;
        try {
            if (arr.length != CORRECT_SIZE && arr[0].length != CORRECT_SIZE)
                throw new ArraySizeException();
        } catch(ArraySizeException e) {
            throw new ArraySizeException("array is not 4x4");
        }
    }

    public static int sumIntInString(String[][] arr) throws ArrayDataException {
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new ArrayDataException("An element of String array cannot be transform to int type, on position: [" + i + "][" + j + "]\"" + arr[i][j] + "\"");
                }
            }
        }
        return sum;
    }
}
