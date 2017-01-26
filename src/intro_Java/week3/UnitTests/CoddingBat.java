package intro_Java.week3.UnitTests;

/**
 * Created by Joker on 25.12.2016.
 */
public class CoddingBat {

    public static int count7(int n) {
        int i = 0;
        if(n == 0) return i;
        if (n % 10 == 7) i++; {
            return i + count7(n/10);
        }
    }
}
