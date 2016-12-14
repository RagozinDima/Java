package week1;

import javax.lang.model.element.NestingKind;
import java.util.Scanner;

/**
 * Created by Nataly on 04.12.2016.
 */
public class Condition {
    public static void main(String[] args) {

        String login = "dima";
        String pass = "5555";

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter login");

        String enterLogin = scanner.nextLine();
        System.out.println("enter Pass");
        String enterPass = scanner.nextLine();

        boolean loginCompare = login.equals(enterLogin);
        boolean passCompare = pass.equals(enterPass);

        if (loginCompare && passCompare){
            System.out.println("succesful login");
        }else {
            System.out.println("Wrong login or pass");
        }


    }




}
