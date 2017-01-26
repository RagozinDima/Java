package intro_Java.week2;

import intro_Java.week2.utils.ArrayUtils;

/**
 * Created by Joker on 20.12.2016.
 5) Заполнить массив случайными значениями. На четных индексах парные значения, на нечетных непарные*/
public class Zadacha5 {
    public static void main(String[] args) {
        int [] arr = ArrayUtils.createRandomPairAndUnpairedNumbs(10, 10);
        ArrayUtils.printArray(arr);



    }

}
