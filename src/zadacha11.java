import java.util.Scanner;

/**
 * Created by Nataly on 08.12.2016.

 11) Написать программу, которая при вводе числа в диапазоне от 1 до 99
 добавляет к нему слово "копейка" в правильной форме. Например, 1
 копейка, 5 копеек, 42 копейки .

 */
public class zadacha11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number from 1 tot 99");
        int cop = sc.nextInt();

        if (cop >= 11 & cop <= 20) {
            System.out.println(+cop + " копеек");
        }else if(cop == 1 || cop%10 == 1 ){
            System.out.println(+ cop + " копейка");
        }else if(cop >= 2 & cop <= 4 || cop%10 == 2 || cop%10 == 3 || cop%10 == 4 ){
            System.out.println(+ cop + " копейки");
        }else if (cop >= 5 & cop <= 99 ) {
            System.out.println(+cop + " копеек");
        }else{
            System.out.println("Error input! Wrong number");
        }



    }

}
