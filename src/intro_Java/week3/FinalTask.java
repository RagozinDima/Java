package intro_Java.week3;

import intro_Java.week2.utils.ArrayUtils;
import intro_Java.week3.UnitTests.LotteryUtils;

/**
 * Created by Joker on 25.12.2016.
 * *
 * "Лотерея"
 * Програма генерирует шесть случайных, целых чисел в диапазоне от 1 до 42 (включительно).
 * <p>
 * Числа не должны совпадать!!! (сделать отдельным методом в классе ArrayUtils)
 * <p>
 * Пользователь вводит 6 разных чисел в диапазоне от 1 до 42 (включительно). (сделать отдельным методом)
 * <p>
 * Программа вывод в консоль выпавшые номера в порядке возрастания
 * <p>
 * (использовать один из методов в Вашем классе ArrayUtils).
 * <p>
 * И показывает количество угаданных пользователем чисел. (сделать отдельным методом)
 * <p>
 * Придумать варианты поздравлений на случаи совпадений (3 из 6, 4 из 6, 5 из 6, 6 из 6, прочие).
 */
public class FinalTask {
    public static void main(String[] args) {
        int[] lotteryNumbers = LotteryUtils.generSixNumbers(1, 42);
        int[] userNumbers = LotteryUtils.enterSixNumbers();

        System.out.println("Lottery numbers: ");
        ArrayUtils.bubbleSort(lotteryNumbers);
        ArrayUtils.printArray(lotteryNumbers);
        System.out.println();

        System.out.println("User numbers: ");
        ArrayUtils.bubbleSort(userNumbers);
        ArrayUtils.printArray(userNumbers);

        int count = LotteryUtils.countSameNumbers(lotteryNumbers, userNumbers);

        String congrats = LotteryUtils.congrate(count);
        System.out.println(congrats);


    }
}