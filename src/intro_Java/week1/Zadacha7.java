package intro_Java.week1;

import java.util.Scanner;

/**
 * Created by Nataly on 04.12.2016.

 7) Ввести с экрана число от 1 до 12. По номеру месяца выдать сообщение о
 времени года. Если пользователь введет недопустимое число, программа
 должна выдать сообщение об ошибке.
 */
public class Zadacha7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter month number");
        int month = sc.nextInt();

        if (month == 1 || month == 2 || month == 12) {
            System.out.println("winter");
        } else if (month >= 3 && month <= 5) {
            System.out.println("spring");
        } else if (month >= 6 && month <= 8) {
            System.out.println("summer");
        } else if (month >= 9 && month <= 11) {
            System.out.println("Autumn");
        } else {
            System.out.println("wrong number");
        }
        }
    }

