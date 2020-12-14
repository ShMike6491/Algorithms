package hw4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int ans = recursive(5);
        //System.out.println(ans);

        //infiniteRec();
        //correctRec(10);
        //stackCall();
        //callCompare();

        int[] array = new int[25];

        Random rand = new Random();
        for (int i = 0; i < 25; i++) {
            array[i] = rand.nextInt(100);
        }
        System.out.println(Arrays.toString(array));

        long time = System.nanoTime();
        //System.out.println(Arrays.toString(recSort(array)));
        Arrays.sort(array);
        System.out.println(System.nanoTime() - time);
        System.out.println(Arrays.toString(array));


        time = System.nanoTime();
        ans = recBinarySearch(6, 0, array.length-1, array);
        //ans = Binary.search(array, 6);
        System.out.println(ans);
        System.out.println(System.nanoTime() - time);

    }

    private static int recBinarySearch(int key, int a, int b, int[] arr) {
        if(a>b) {return arr.length;}
        int mid = (a+b)/2;
        if(arr[mid] == key) {return mid;}
        if(arr[mid] < key) {
            return recBinarySearch(key, a+1, b, arr);
        } else {
            return recBinarySearch(key, a, b-1, arr);
        }
    }

    /**
     * cортировка рекурсией
     */
    private static int[] recSort(int[] arr) {
        int len = arr.length;
        if (len < 2) { return arr; }
        int mid = len / 2;
        return merge(recSort(Arrays.copyOfRange(arr, 0, mid)), recSort(Arrays.copyOfRange(arr, mid, len)));
    }
    private static int[] merge(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        int aIndex = 0;
        int bIndex = 0;

        for (int i = 0; i < result.length; i++) {
            result[i] = a[aIndex] < b[bIndex] ? a[aIndex++] : b[bIndex++];
            if(aIndex == a.length) {
                System.arraycopy(b, bIndex, result, ++i, b.length-bIndex);
                break;
            }
            if(bIndex == b.length) {
                System.arraycopy(a, aIndex, result, ++i, a.length-aIndex);
                break;
            }
        }
        return result;
    }

    /**
     * сравнение вызова fori и рекурсивной функции
     */
    private static void callCompare() {

        int sum = 0;
        long timeSet = System.nanoTime();
        for (int i = 100; i > 0 ; i--) { sum += i; }
        System.out.println(System.nanoTime() - timeSet);
        System.out.println(sum);

        timeSet = System.nanoTime();
        System.out.println(recursive(100));
        System.out.println(System.nanoTime() - timeSet);
    }

    /**
     * пример стека вызовов
     */
    private static void stackCall() {
        System.out.println("Called from main");
        one();
    }

    /**
     * ограниченная рекурсия
     */
    private static void correctRec(int n) {
        if(n < 0 || n > 100) {
            return;
        }
        System.out.println("hey " + n + " times");
    }

    /**
     * бесконечная рекурсия
     */
    private static void infiniteRec() {
        System.out.println("Hey!");
        infiniteRec();
    }

    /**
     * пример рекурсии
     */
    private static int recursive(int n) {
        if(n <= 1) {
            return 1;
        }

        return n + recursive(n-1);
    }
    private static void one() {
        System.out.println("called from stackCall");
        two();
    }
    private static void two() {
        System.out.println("Called from one");
    }
}
