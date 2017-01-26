package intro_Java.week3;

import java.util.Arrays;

/**
 * Created by Joker on 24.12.2016.
 */
public class Sort_String {
    public static void main(String[] args) {
        String [] sentence = "Hello, i love Chocolate!".split(" ");
        System.out.println(Arrays.toString(sentence));


        for (int j = 0; j < sentence.length; j++) {
                for (int i = 0; i < sentence.length - 1; i++) {
                    if (sentence[i].compareTo(sentence[i + 1]) > 0 ) {
                        String tmp = sentence[i];
                        sentence[i] = sentence[i + 1];
                        sentence[i + 1] = tmp;
                    }
                }

            }
        System.out.println(Arrays.toString(sentence));
        }
}
