import java.util.Scanner;

/**
 /* Created by Nataly on 07.12.2016.
 Ввести с клавиатуры значения трех сторон треугольника a, b и c и опреде-
 лить, является ли он прямоугольным. Ответ
 вывести в виде сообщения.*/
public class zadacha1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter side A ");
        int sideA = sc.nextInt();

        System.out.println("Enter side B ");
        int sideB = sc.nextInt();

        System.out.println("Enter side C ");
        int sideC = sc.nextInt();

       if(sideA * sideA == sideB * sideB + sideC * sideC){
           System.out.println("treugolnik pryamougolnui");
       }else if(sideB * sideB == sideA * sideA + sideC * sideC){
           System.out.println("treugolnik pryamougolnui");
       }else if(sideC * sideC == sideA * sideA + sideB * sideB){
           System.out.println("treugolnik pryamougolnui");
       }else {
           System.out.println("treugolnik ne pryamougolnui");
       }


    }

}
