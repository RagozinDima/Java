package intro_Java.week3;

/**
 * Created by Joker on 24.12.2016.
 */
public class _01StringIntro {
    public static void main(String[] args) {
        String name = "Dima";
        String surname = "Rahozin";

        System.out.println(name.length());
        System.out.println(name.isEmpty());
        System.out.println(name.equals("Dima"));
        System.out.println(name.compareTo("zoo")); //сортировка
        System.out.println(name.substring(3)); //обрезает слово, 3 - обрезает до третьего,
        System.out.println(name.startsWith("Di"));
        System.out.println(name.endsWith("ma"));
        System.out.println(name.charAt(3));
        System.out.println(name.indexOf("D")); //передаем букву, выводит индекс первого встречающегося

        String[] word = "Hello my name is Dima".split(" ");
        System.out.println(word); //не конает
        System.out.println();
    }


}
