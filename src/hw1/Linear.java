package hw1;

public class Linear {
    /**
     * Линейный поиск.
     */
    public static int search (int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if(num == arr[i]) {
                return i;
            }
        }
        return -1;
    }
}
