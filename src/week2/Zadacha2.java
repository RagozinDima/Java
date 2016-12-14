package week2;

import week2.utils.ArrayUtils;

/**
 * Created by Nataly on 11.12.2016.
 2) Поменять местами наибольший и наименьший элементы в массиве*/
public class Zadacha2 {
    public static void main(String[] args) {
        int[] arr = ArrayUtils.createAndFillRandomArray(5);
        ArrayUtils.printArray(arr);
        ArrayUtils.swapMinMax(arr);


    }


}
