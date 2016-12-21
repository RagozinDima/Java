package week2;

import week2.utils.ArrayUtils;

/**
 * Created by Nataly on 11.12.2016.
 3) Заданы два массива одинаковой длинны с любыми значениями скопировать данные из первого массива во второй*/
public class Zadacha3 {
    public static void main(String[] args) {
        int [] arr = ArrayUtils.createAndFillRandomArray(10);
        int [] arr2 = new int[10];

        ArrayUtils.printArray(arr);
        System.out.println();
        ArrayUtils.printArray(arr2);
        System.out.println();

        ArrayUtils.copyArr(arr, arr2);
        System.out.println("-------------------------");
        ArrayUtils.printArray(arr);
        System.out.println();
        ArrayUtils.printArray(arr2);



    }

}
