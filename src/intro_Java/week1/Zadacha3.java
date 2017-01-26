package intro_Java.week1;

/**
 * Created by Nataly on 07.12.2016.
 3) Дано трехзначное число. Определить: а) верно ли, что все его цифры
 одинаковые; б) есть ли среди его цифр одинаковые.*/
public class Zadacha3 {
    public static void main(String[] args) {
        int n = 123;

        if ((n / 100) == (n / 10 % 10) && (n / 10 % 10) == (n % 10) && (n / 100) == (n % 10)) {
            System.out.println("Number consists of identical digits ");
        } else if ((n / 100) == (n / 10 % 10) || (n / 10 % 10) == (n % 10) || (n / 100) == (n % 10)) {
            System.out.println("Number have the same digits ");
        } else {
            System.out.println("Number haven't the same digits !");
        }
    }
}
