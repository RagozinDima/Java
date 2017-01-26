package intro_Java.week2;

import java.util.Scanner;

/**
 * Created by Nataly on 11.12.2016.
 */
public class Tast6 {
    public static void main(String[] args) {
        int random  = (int) (25 + Math.random ()* (126-25));

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int userNumber = sc.nextInt();

        for (int i = 0; i < 5; i++) {
            if (userNumber == random) {
                System.out.println("Congrats! ");
                break;
            } else if (userNumber > random) {
                System.out.println("Enter lower number ");
            } else {
                System.out.println("Enter higher number ");
            }userNumber = sc.nextInt();
        }



    }
}
