package week2;

import week2.utils.ArrayUtils;

/**
 * Created by Joker on 21.12.2016.
 7) Вывести в консоль элементы той половины одномерного массива у которой среднее арифметическое максимальное*/
public class Zadacha7 {
    public static void main(String[] args) {


        int [] arr = ArrayUtils.createAndFillRandomArray(8);
        ArrayUtils.printArray(arr);
        System.out.println();
        ArrayUtils.printDivArr(arr);
    }

}
