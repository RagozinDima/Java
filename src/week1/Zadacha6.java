package week1;

import java.util.Scanner;

/**
 * Created by Nataly on 09.12.2016.
 6) У вас есть скорость и растояние, за какое время вы приедете в пукт назначания. (путь/скорость)*/
public class Zadacha6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter speed 'km/h': ");
        double speed = sc.nextDouble();

        System.out.println("Enter way 'km': ");
        double way = sc.nextDouble();

        System.out.println("Travel time = " + (way/speed));


    }

}
