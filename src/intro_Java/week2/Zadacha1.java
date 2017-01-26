package intro_Java.week2;

import intro_Java.week2.utils.ArrayUtils;

/**
 * Created by Nataly on 11.12.2016.
 1) Найти минимальное и максимальное значения в массиве и вывести их на консоль*/
public class Zadacha1 {
    public static void main(String[] args) {
        int[] arr = ArrayUtils.createAndFillRandomArray(10);
        ArrayUtils.printArray(arr);

        ArrayUtils.printMinMax(arr);

    }
}
