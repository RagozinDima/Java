package intro_Java.week1;

import java.util.Scanner;

/**
 * Created by Nataly on 09.12.2016.
 5.3. Посчитать сколько раз встречается символ 8 в заданном числе, которое вводит юзер
 5678  -   1
 5889  -   2
 8888  -   4
 989990  - 1*/
public class Zadacha5_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number for verification: ");
        int numb = sc.nextInt();

        int count = 0;
        while (numb > 0) {
            if ((numb % 10) == 8) {
                count++;
            }
            numb = numb / 10;
        }
        System.out.println("Number '8' found " + count + " times");

    }


}
