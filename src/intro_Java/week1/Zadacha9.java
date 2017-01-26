package intro_Java.week1;

import java.util.Scanner;

/**
 * Created by Nataly on 08.12.2016.
 9) Написать программу вычисления идеального веса пользователя (рост- 100).
    Выдать рекомендации о необходимости поправиться либо похудеть.*/


public class Zadacha9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String men = "Men";
        String women = "Women";

        System.out.println("Enter your gender, 'Men' or 'Women': ");
        String gender = sc.nextLine();

        System.out.println("Enter your height: ");
        double height = sc.nextDouble();

        System.out.println("Enter your weight: ");
        double weight = sc.nextDouble();

        double idealMen = (height - 100);
        double idealWomen = ((height - 100) - (height - 150) / 2);

        boolean itmen = men.equals(gender);
        boolean itwomen = women.equals(gender);

        if (itmen) {
            System.out.println("Your ideal weight: " + idealMen);
            if (idealMen > weight) {
                System.out.println("Advice: You need to eat better");
            } else if (idealMen < weight) {
                System.out.println("Advice: Stop eating, you are fat! Go to the gym.");
            } else if (idealMen == weight) {
                System.out.println("Your weight is perfect! Good job! ");
            }
        } else if (itwomen) {
            System.out.println("Your ideal weight: " + idealWomen);
            if (idealWomen > weight) {
                System.out.println("Advice: You need to eat better");
            } else if (idealWomen < weight) {
                System.out.println("Advice: Stop eating, you are fat! Go to the gym.");
            } else if (idealWomen == weight) {
                System.out.println("Your weight is perfect! Good job! ");
            }
        } else {
            System.out.println("Error input! :( ");
        }
    }
}
