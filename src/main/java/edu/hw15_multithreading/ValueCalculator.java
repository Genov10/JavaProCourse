package edu.hw15_multithreading;

public class ValueCalculator {
    private final float[] arr = new float[1000000];
    private final int arrSize = arr.length;
    private final int halfOfArr = arrSize/2;

    private void arrayRecalc(float[] array)
    {
        for (int i = 0; i < array.length; i++) {
            array[i] = (float) (array[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }

    public void start() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < arrSize; i++) {
            arr[i] = 1;
        }
        float[] array1 = new float[halfOfArr];
        float[] array2 = new float[halfOfArr];

        System.arraycopy(arr, 0, array1, 0, halfOfArr);
        System.arraycopy(arr, halfOfArr, array2, 0, halfOfArr);

        new Thread(() -> arrayRecalc(array1)).start();
        new Thread(() -> arrayRecalc(array2)).start();

        System.arraycopy(array1, 0, arr, 0, halfOfArr);
        System.arraycopy(array2, 0, arr, halfOfArr, halfOfArr);

        System.out.println("Time in milles: " + start);
    }
}
