package intro_Java.week3;

import intro_Java.week2.utils.MatrixUtils;

/**
 * Created by Joker on 25.12.2016.
 3. Напишите метод, заменяющий в строке все вхождения слова «бяка» на «вырезано цензурой»(не используя метод replaceAll()). */
public class Zadacha3 {
    public static void main(String[] args) {

        String text = "Hello my bjaka name is bjaka Dima";

        String[] words = text.split(" ");

        String censoredText = MatrixUtils.censored(words);
        System.out.println(censoredText);



    }

}
