package week1;

import java.util.Scanner;

/**
 * Created by Nataly on 04.12.2016.
 */
public class LuckyNumber14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number(6digits): ");

        int number = sc.nextInt();

        int first= number / 10000;
        int second =(number / 10000) % 10;
        int thirdd =(number / 1000) % 10;
        int fourth =(number / 100) % 10;
        int fifth =(number / 10) %10;
        int sixth = number % 10;


    }


}
