import java.util.Scanner;

/**
 * Created by Nataly on 07.12.2016.
 4.5. Вводим 2 числа. Если первое число больше второго, то вывести на экран разницу чисел. Если второе больше, то выводим сумму.*/
public class zadacha4_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 2 numbers: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        if(n1 > n2){
            System.out.println("The first number is largest");
            System.out.println("Difference = " + (n1-n2));
        }else {
            System.out.println("The second number is largest");
            System.out.println("Sum = " + (n1+n2));
        }
    }
}
