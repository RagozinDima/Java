package week2;

import com.sun.deploy.util.ArrayUtil;
import week2.utils.ArrayUtils;

/**
 * Created by Nataly on 11.12.2016.
 1) Найти минимальное и максимальное значения в массиве и вывести их на консоль*/
public class Zadacha1 {
    public static void main(String[] args) {
        int[] arr = ArrayUtils.createAndFillRandomArray(10);
        ArrayUtils.printArray(arr);

        int min = ArrayUtils.findMin(arr);
        int max = ArrayUtils.findMax(arr);
        ArrayUtils.printMinMax(arr);

    }
}
