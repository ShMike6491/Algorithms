package hw4;

public class Binary {
    /**
     * Двоичный поиск.
     */
    public static int search (int[] arr, int num) {
        int lastI = arr.length-1;
        int firstI = 0;
        int midI;
        while(firstI <= lastI) {
            midI = (firstI + lastI)/2;
            if (num == arr[midI]) {
                return midI;
            }
            if (num > arr[midI]) {
               firstI = midI + 1;
            }
            if (num < arr[midI]) {
                lastI = midI - 1;
            }
        }
        return -1;
    }
}
