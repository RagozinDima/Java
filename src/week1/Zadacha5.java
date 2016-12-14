package week1;

/**
 * Created by Nataly on 04.12.2016.
 * Даны 3 числа a b c Определись, имеется ли среди них хотя бы одна пара равных
 */
public class Zadacha5 {
    public static void main(String[] args) {
        int a = 15;
        int b = 15;
        int c = 30;

        if(a == b || a == c || b == c){
            System.out.println("one pair is equal");
        }
            else {
            System.out.println("no one pair is equal");
        }
    }
}
