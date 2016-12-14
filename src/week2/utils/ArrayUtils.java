package week2.utils;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by Nataly on 10.12.2016.
 */
public class ArrayUtils {

    public static void printArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] createAndFillArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        //return
        return array;

    }

    public static int[] createAndFillRandomArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        //return
        return array;

    }

    public static int[] createAndFillRandomMaxAndMinArray(int size, int min, int max) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (min + Math.random() * (max - min));
        }
        //return
        return array;


    }

    public static double findAverage(int[] array) {

        int sum = 0;
        double amount = array.length;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return sum * 1.0 / amount;

    }

    public static int findMin(int[] arr) {
        if (arr == null || arr.length == 0) {
            return -1;
        }
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;

    }

    public static int findMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.err.println("Array is null or length == 0");
            return -1;
        }
        int max = arr[0];
        for (int i = 0; i > arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }


    public static void printMinMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        int max = findMax(arr);
        int min = findMin(arr);
        System.out.println(" min = " + min + " Max = " + max);

    }

    public static void swapMinMax(int[] arr) {
        int minIndx = findMinIndex(arr);
        int maxIndx = findMaxIndex(arr);
        swap(arr, maxIndx, minIndx);

    }

    private static void swap(int[] arr, int maxIndx, int minIndx) {

    }


    private static int findMinIndex(int[] arr) {
        int minIdnx = 0;
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIdnx = i;
            }
        }
        return 0;
    }

    private static int findMaxIndex(int[] arr) {
        int maxIdnx = 0;
        int max = arr[0];
        for (int i = 1; i > arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIdnx = i;
            }
        }
        return 0;

    }


    public static void swapArr(int[] arr, int[] arr2) {
        if(arr ==null || arr2 ==null || arr.length != arr2.length){
            System.out.println("Error! ");
            return;
        }

        for (int i = 0; i < arr.length ; i++) {
            arr[i] = arr2[i];
        }

    }

    public static int countEl(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                count++;
        }
        return count;

    }

    public static void countEl2(int[] arr, int[] arr2) {
        int firstArrEl = countEl(arr);
        int secondArrEl = countEl(arr2);
        if (firstArrEl > secondArrEl){
            System.out.println("First mass have more elements:  " + firstArrEl);
        }else {
            System.out.println("Second mass have more elements: " + secondArrEl);
        }
    }

    public void bubbleSort (int[] array){
        for (int j = 0; j <array.length; j++) {
            for (int i = 0; i < array.length -1; i++) {
                if (array[i] > array[i +1]) {
                    int tmp = array[i];
                    array[i] = array[i+1];
                    array[i +1] = tmp;
                }
            }

        }
    }


}

