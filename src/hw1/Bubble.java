package hw1;

public class Bubble {
    /**
     * Сортировка методом пузырька
     */
    public static void sort (int[] arr) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if(arr[i] > arr[i+1]) {
                    isSorted = false;
                    swap(arr, i, i+1);
                }
            }
        }
    }

    private static void swap (int[] arr,int num1, int num2) {
        int temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
    }
}
