package hw1;

public class Insertion {
    /**
     * Сортировка методом вставки.
     */
    public static void sort (int[] arr) {
        int index, temp;
        for (int i = 1; i < arr.length; i++) {
            temp = arr[i];
            index = i;
            while(index > 0 && arr[index-1] > temp) {
                arr[index] = arr[index-1];
                --index;
            }
            arr[index] = temp;
        }
    }
}
