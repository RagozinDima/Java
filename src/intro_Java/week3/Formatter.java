package intro_Java.week3;

/**
 * Created by Joker on 24.12.2016.
 */
public class Formatter {
    public static void main(String[] args) {
        String name = "Dima";
        String surname = "Rahozin";
        String name2 = "vasya";
        String surname2 = "Rahozin";
        int age = 25;
        String phone = "+38066 315 07 72";

        //System.out.println("Hello " + name + surname + "You are " + age + " your tel number " + phone);

        //System.out.printf("Hello %s, %s \nYou are %d years old. Your phone is %s",name, surname,age,phone);
        System.out.printf("%-10s %10s\n", name, surname);
        System.out.printf("%-10s %10s\n", name, surname);


    }

}
