package week1;

import java.security.KeyStore;
import java.util.Scanner;

/**
 * Created by Nataly on 07.12.2016.
 4.7. Вводим два числа, если одно из них делиться на другое без остатка, то выводим тру и показываем результат деления (целую часть от деления)
 в другом случае выводим false и показываем результат деления (целую часть от деления  и остачу)*/
public class Zadacha4_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 2 numbers: ");
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();

        boolean prov = (n1%n2 == 0);
        System.out.println(prov);

        int n3 = (int)(n1/n2);
        double n4 = (n1/n2 % 1);
        System.out.println("Tselaya chast' " + n3);
        System.out.println("Ostatok " + n4);

    }
}