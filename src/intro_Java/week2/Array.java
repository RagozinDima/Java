package intro_Java.week2;

/**
 * Created by Nataly on 10.12.2016. от 99 до 0
 */
public class Array {
    public static void main(String[] args) {
        int[] arr = new int[100];

                    
        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = i;

            System.out.print(arr[i] + " ");
        }
        //ArrayUtils.printArray(arr);
    }
}
