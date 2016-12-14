package week2;

import week2.utils.ArrayUtils;

/**
 * Created by Nataly on 10.12.2016.
 6) Найти среднее арифметическое массива*/
public class Zadacha6 {
    public static void main(String[] args) {
        int [] array = ArrayUtils.createAndFillArray(20);

        double average = ArrayUtils.findAverage(array);
        System.out.println(average);

    }

}
