package week2;

import week2.utils.ArrayUtils;

/**
 * Created by Joker on 21.12.2016.
 8) Eсть два массива одинаковой длины arr1 и arr2 вывести в консоль значения массива,
 который получается в результате суммы arr1[i] + arr2[i]*/
public class Zadacha8 {
    public static void main(String[] args) {

        int[] arr1 = ArrayUtils.createAndFillRandomArray(10);
        int[] arr2 = ArrayUtils.createAndFillRandomArray(10);

        ArrayUtils.printArray(arr1);
        System.out.println();
        ArrayUtils.printArray(arr2);
        System.out.println("\n-----------------------------");

        ArrayUtils.sumTwoArray(arr1, arr2);

    }
}
