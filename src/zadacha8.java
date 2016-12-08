import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by Nataly on 04.12.2016.
 8) Вычислить стоимость покупки с учетом скидки. Скидка в 10% предос-
 тавляется, если сумма покупки превышает 1000 гривен.
 */
public class zadacha8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the purchase amount: ");
        double sum = sc.nextDouble();

        if(sum > 1000){
            System.out.println("You get 10% discount " + sum + " To pay = " + (sum - (sum*0.1)));
        }else if (sum <= 1000){
            System.out.println("You don't receive a discount, sorry. To pay = " + sum);
        }else {
            System.out.println("Input Error");
        }



    }
}
