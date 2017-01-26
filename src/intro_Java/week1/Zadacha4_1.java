package intro_Java.week1;

import java.util.Scanner;

/**
 * Created by Nataly on 07.12.2016.
 4.1. Пользователь вводит параметр с консоли (текущий час от 0 до 24)
 Если время от 9 до 18, то выводим "Я на работе", в другом случае "Я отдыхаю")*/
public class Zadacha4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter time:");
        int time = sc.nextInt();

        if (time >= 0 & time <= 9){
            System.out.println("I'am rest! =)");
        }else if (time >= 9 & time <= 18){
            System.out.println("I'am WORKING! Fuck oFF :D =)");
        }else if (time >= 18 & time <= 24) {
            System.out.println("I'am rest!");
        }else {
            System.out.println("You enter wrong time!!");
        }
    }

}
