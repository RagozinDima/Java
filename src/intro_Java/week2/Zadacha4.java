package intro_Java.week2;

import intro_Java.week2.utils.ArrayUtils;

/**
 * Created by Joker on 18.12.2016.
 4) Посчитать сколько цифр(цифра задается пользователем) в массиве*/
public class Zadacha4 {
    public static void main(String[] args) {

        int [] arr = ArrayUtils.createAndFillRandomArray(60);
        int count = ArrayUtils.countElArr(arr,12);
        ArrayUtils.printArray(arr);
        System.out.println();
        System.out.println("Array have " + count + " matches.");


    }

}
