package hw1;

public class Selection {
    /**
     * Сортировка методом выбора.
     */
    public static void sort (int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[min])
                    min = j;
            }
            swap(arr, i, min);
        }
    }

    private static void swap (int[] arr,int num1, int num2) {
        int temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
    }
}
