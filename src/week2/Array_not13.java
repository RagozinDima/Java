package week2;

import week2.utils.ArrayUtils;

/**
 * Created by Nataly on 10.12.2016.
 */
public class Array_not13 {

    public static void main(String[] args) {
       /* int [] arr = new int[100];

        for (int i = 0; i < arr.length; i++) {
            arr [i] = i;
            if( i == 13){
                continue;
            }
            System.out.println(i);
        }*/
        int [] array = ArrayUtils.createAndFillRandomMaxAndMinArray(100, 5,10);
        ArrayUtils.printArray(array);

    }
}
