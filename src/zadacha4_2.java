import java.util.Scanner;

/**
 * Created by Nataly on 07.12.2016.
 4.2. Пользователь вводит три числа с консоли, нужно вывести на консоль наибольшее, наименьшее*/
public class zadacha4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");
        double numb1 = sc.nextDouble();
        double numb2 = sc.nextDouble();
        double numb3 = sc.nextDouble();

        double max = Math.max (Math.max(numb1, numb2), numb3);
        System.out.println("The largest number is..." + max);

        double min = Math.min (Math.min(numb1, numb2), numb3);
        System.out.println("The smallest number is..." + min);

    }

}
