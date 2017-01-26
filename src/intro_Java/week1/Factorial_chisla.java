package intro_Java.week1;

import java.util.Scanner;

/**
 * Created by Nataly on 09.12.2016.
 5.2. Вычислить факториал числа.*/
public class Factorial_chisla {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int numb = sc.nextInt();

        int res = 1;

        if(numb == 0){
            res = 0;
        }
        for (int x = 1; x <= numb; x ++){
            res = res * x;
        }
        System.out.println("Factorial number " +numb + " = "+ res);

    }

}
