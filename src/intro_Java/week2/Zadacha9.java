package intro_Java.week2;

import intro_Java.week2.utils.ArrayUtils;

/**
 * Created by Joker on 21.12.2016.
 9) Задать два массива случайными числами от 25 до 75. Определить у какого из массивов больше парных елементов.*/
public class Zadacha9 {
    public static void main(String[] args) {

        int [] arr = ArrayUtils.createAndFillRandomMaxAndMinArray(10,25,75);
        int [] arr2 = ArrayUtils.createAndFillRandomMaxAndMinArray(10,25,75);

        ArrayUtils.printArray(arr);
        System.out.println();
        ArrayUtils.printArray(arr2);

        ArrayUtils.countPairNumbersInArr(arr);
        ArrayUtils.countPairNumbersInArr(arr2);


        System.out.println();
        ArrayUtils.printPairNumbersOfTwoArray(arr,arr2);



    }
}
