package intro_Java.week2.utils;

/**
 * Created by Nataly on 10.12.2016.
 */
public class ArrayUtils {

    public static void printArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] createAndFillArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        //return
        return array;

    }

    public static int[] createAndFillRandomArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 20);
        }
        //return
        return array;

    }

    public static int[] createAndFillRandomMaxAndMinArray(int size, int min, int max) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (min + Math.random() * (max - min));
        }
        //return
        return array;


    }

    public static double findAverage(int[] array) {

        int sum = 0;
        double amount = array.length;

        for (int i = 0; i < array.length; i++) {
            //sum = sum + array[i];
            sum += array[i];
        }

        return sum * 1.0 / amount;

    }

    private static int findMin(int[] array) {

        if (array == null || array.length == 0) {
            return -1;
        }
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    private static int findMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }


    public static void printMinMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.err.println("Array is null or length == 0");
            return;
        }
        int max = findMax(arr);
        int min = findMin(arr);
        System.out.println(" min = " + min + " Max = " + max);

    }

    public static void swapMinMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.err.println("Array is null or length == 0");
            return;
        }
        int minIndx = findMinIndex(arr);
        int maxIndx = findMaxIndex(arr);
        swap(arr, maxIndx, minIndx);

    }

    private static void swap(int[] arr, int maxIndx, int minIndx) {
        int temp = arr[maxIndx];
        arr[maxIndx] = arr[minIndx];
        arr[minIndx] = temp;
    }


    private static int findMinIndex(int[] arr) {
        int minIdnx = 0;
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIdnx = i;
            }
        }
        return minIdnx;
    }

    private static int findMaxIndex(int[] arr) {
        int maxIdnx = 0;
        int max = arr[0];
        for (int i = 1; i > arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIdnx = i;
            }
        }
        return maxIdnx;

    }


    public static void copyArr(int[] arr, int[] arr2) {
        if (arr == null || arr2 == null || arr.length != arr2.length) {
            System.out.println("Wrong data! ");
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];

        }
    }

    private static int countEl(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                count++;
        }
        return count;

    }

    public static void countEl2(int[] arr, int[] arr2) {
        int firstArrEl = countEl(arr);
        int secondArrEl = countEl(arr2);
        if (firstArrEl > secondArrEl) {
            System.out.println("First mass have more elements:  " + firstArrEl);
        } else {
            System.out.println("Second mass have more elements: " + secondArrEl);
        }
    }

    public static void bubbleSort(int[] array) {
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                }
            }
        }
    }
// ---------------------------H O M E--W O R K--------------------------------------------

    public static int countElArr(int[] arr, int numb) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numb)
                count++;
        }
        return count;

    }

    public static int[] createRandomPairAndUnpairedNumbs(int size, int diapazon) {

        int[] arr = new int[size];
        int random = 0;

        for (int i = 0; i < arr.length; i++) {
            random = (int) (Math.random() * diapazon);
            if (i == 0 || i % 2 == 0) {

                if (random % 2 == 0) {
                    arr[i] = random;
                } else {
                    arr[i] = random + 1;
                }

            } else {

                if (random % 2 != 0) {
                    arr[i] = random;
                } else {
                    arr[i] = random + 1;
                }
            }
        }
        return arr;
    }

    private static int findDivArr(int[] arr) {
        int sum = 0;
        int arr50 = arr.length / 2;
        for (int i = 0; i < arr50; i++) {
            sum += arr[i];
        }
        return sum / arr50;
    }

    private static int findDivArr2(int[] arr) {
        int sum2 = 0;
        int arr50 = arr.length / 2;
        for (int i = arr50; i < arr.length; i++) {
            sum2 += arr[i];
        }
        return sum2 / arr50;
    }

    public static void printDivArr(int[] arr) {
        int sum = findDivArr(arr);
        int sum2 = findDivArr2(arr);
        if (sum > sum2) {
            System.out.println("Average of the first half array is larger : " + sum);
        } else {
            System.out.println("Average of the second half array is larger : " + sum2);
        }
    }

    public static int countPairNumbersInArr(int [] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count ++;
            }
        }return count;
    }

    public static void printPairNumbersOfTwoArray (int [] arr, int [] arr2){
        int count = countPairNumbersInArr(arr);
        int count2 = countPairNumbersInArr(arr2);
        if (count > count2) {
                System.out.println("First Array have more pair numbers: " + count);
            } else if(count < count2) {
                System.out.println("Second Array have more pair numbers: " + count2);
            }else{
            System.out.println("Two arrays have the same number of pairs of numbers: " + count);
        }
    }

    public static void sumTwoArray(int[] arr1, int[] arr2) {
        int[] sumArr = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            sumArr[i] = arr1[i] + arr2[i];
            System.out.print(sumArr[i] + " ");
        }
    }




}