package intro_Java.week1;

import java.util.Scanner;

/**
 * Created by Nataly on 07.12.2016.
 2) Ввести с клавиатуры три числа, положительные возвести в куб, а отрица-
 тельные заменить на 0.

 */
public class Zadacha2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 3 numbers: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        if (n1 > 0) {
            int kub1 = (int) Math.pow(n1, 3);
            System.out.println("First number > 0. V kube = " + kub1);
        } else {
            System.out.println("First number < 0. Ravno = 0 ");
        }

        if (n2 > 0) {
            int kub2 = (int) Math.pow(n2, 3);
            System.out.println("Second number > 0. V kube = " + kub2);
        } else {
            System.out.println("Second number < 0. Ravno = 0 ");
        }

        if (n3 > 0) {
            int kub3 = (int) Math.pow(n3, 3);
            System.out.println("Third number > 0. V kube = " + kub3);
        } else {
            System.out.println("Third number < 0. Ravno = 0 ");
        }
    }


}