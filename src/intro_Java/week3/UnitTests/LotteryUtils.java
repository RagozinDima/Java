package intro_Java.week3.UnitTests;

import java.util.Scanner;

/**
 * Created by Joker on 25.12.2016.
 */
public class LotteryUtils {
    public static int[] generSixNumbers(int from, int till) {
        int[] array = new int[6];
        for (int i = 0; i < array.length; i++) {
            int number;
            while (true){
                number = (int) (from + Math.random() * (till + 1 - from));
                if (!contains(array, number)) break;
            }
            array[i] = number;
        }
        return array;
    }

    private static boolean contains(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) return true;
        }
        return false;
    }

    public static int[] enterSixNumbers() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 6 digits from 1 to 42");

        int[] arr = new int[6];

        for (int i = 0; i < arr.length; i++) {
            int number = input.nextInt();
            arr[i] = number;
            if(number < 1 || number > 42){
                System.out.printf("ERROR!");
            }
        }


        return arr;
    }

    public static int countSameNumbers(int[] lotteryNumbers, int[] userNumbers) {
        int count = 0;
        for (int i = 0; i < lotteryNumbers.length; i++) {
            for (int j = 0; j <userNumbers.length ; j++) {
                if (lotteryNumbers[i] == userNumbers[j]) {
                    count++;
                }
            }

        }return count;
    }

    public static String congrate(int count) {
        if (count == 3){
            System.out.println("\nCongratulation, you win 5$! Matches - " + count);
        }else if (count == 4){
            System.out.println("\nCongratulation, you win 20$! Matches - " + count);
        }else if (count == 5){
            System.out.println("\nCongratulation, you win 50$! Matches - " + count);
        }else if (count == 6){
            System.out.println("\nCongratulation, you win Jackpot! 100 000$! Matches - " + count);
        } else {
            System.out.println("\nYou're lose, good luck next time! Matches - " + count);
        }
        return "";
    }


}
