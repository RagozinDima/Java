package intro_Java.week3;

import intro_Java.week2.utils.MatrixUtils;

/**
 * Created by Joker on 24.12.2016.
 2. Ввести предложение с консоли, найти самое короткое и самое длинное слово.
 Вывести найденные слова и их длину.*/
public class Zadacha2 {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence!");

        String sent = sc.nextLine();
        String [] sent2 ="Hello my".split( " ");
        */
        String text = "Hello my name is Dima, i love Chocolate!";

        String[] words = text.split(" ");

        MatrixUtils.printMinMax(words);


        }


    }

