package intro_Java.week3;

/**
 * Created by Joker on 25.12.2016.
 */
public class Time {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        String str = "0";

        for (int i = 1; i < 1_000_00; i++) {
            str = str + ", " + i;
        }

        long end = System.currentTimeMillis();

        long time  = end - start;
        System.out.println(str);
        System.out.println("Time - " + time);


    }

}
