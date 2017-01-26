package intro_Java.week3;

/**
 * Created by Joker on 25.12.2016.
 */
public class StringBilderIntro {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        StringBuilder str = new StringBuilder("0");


        for (int i = 1; i < 1_000_000; i++) {
            str.append(", ");
            str.append(i);
        }


        System.out.println(str.toString());
        long end = System.currentTimeMillis();
        long time  = end - start;
        System.out.println("Time - " + time);
    }

}
