import java.util.Scanner;

/**
 * Created by Nataly on 07.12.2016.
 4.4. Вводим число с плавающей точкой с консоли, и проверяем лежит ли оно в диапазоне от 0 до 1*/
public class zadacha4_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter numbers with a floating point: ");
        double numb = sc.nextDouble();

        if(numb >= 0 & numb <= 1){
            System.out.println("Number ranging from 0 to 1");
        }else {
            System.out.println("Number NOT ranging from 0 to 1");
        }


    }

}
