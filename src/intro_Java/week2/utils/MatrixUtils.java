package intro_Java.week2.utils;

/**
 * Created by Joker on 24.12.2016.
 */
public class MatrixUtils {
    public static int[][] createAndFillMatrix(int rows, int colums) {
        int[][] matrix = new int[rows][colums];

        int counter = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colums; j++) {
                matrix[i][j] = counter++;
            }
        }
        return matrix;
    }

    public static void fillMatrix(int[][] matrix) {

        int counter = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = counter++;
            }
        }
    }

    public static void printMatrix(int[][] matrix) {


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%-3d ", matrix[i][j]);
            }
            System.out.println();
        }
    }

    private static String findMax(String[] array) {
        String max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].length() > max.length()) {
                max = array[i];
            }
        }
        return max;
    }

    private static String findMin(String[] array) {

        String min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].length() < min.length()) {
                min = array[i];
            }
        }
        return min;
    }

    public static void printMinMax(String[] array) {
        if (array == null || array.length == 0) {
            System.err.println("Array is null or length == 0");
            return;
        }
        String max = findMax(array);
        String min = findMin(array);
        System.out.println("min - " + min + " max - " + max);
    }

    public static String censored(String[] words) {

        String cut = "censored";

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals("bjaka")) {
                words[i] = cut;
            }
        }

        return makeString(words);

    }

    public static String makeString(String[] words) {
//        todo check on null and length
        StringBuilder text = new StringBuilder(words[0]);
        for (int i = 1; i < words.length; i++) {
            text.append(" ").append(words[i]);
        }
        return text.toString();
    }
}

