package week2;

import week2.utils.ArrayUtils;

/**
 * Created by Nataly on 11.12.2016.
 Задать два массива случайными числами от 25 до 75. Определить у какого из массивов больше парных елементов.*/
public class ZadachaXX {
    public static void main(String[] args) {
        int[] arr = ArrayUtils.createAndFillRandomMaxAndMinArray(90, 25, 75);
        int[] arr2 = ArrayUtils.createAndFillRandomMaxAndMinArray(90, 25, 75);


        ArrayUtils.printArray(arr);
        System.out.println();
        ArrayUtils.printArray(arr2);
        System.out.println();

        ArrayUtils.countEl2(arr, arr2);




    }
}
