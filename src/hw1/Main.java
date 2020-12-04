package hw1;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        long t1, t2;
        int[] array = new int[25];

        Random rand = new Random();
        for (int i = 0; i < 25; i++) {
            array[i] = rand.nextInt(100);
        }

        //Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        t1 = System.nanoTime();
        //int[] newArray;
        //newArray = Arrays.copyOf(array, 10);
        //newArray = array;
        //Arrays.sort(array);

        //Linear.search(array, 10);
        //Binary.search(array, 10);
        //Bubble.sort(array);
        //Selection.sort(array);
        Insertion.sort(array);
        t2 = System.nanoTime();

        System.out.println(Arrays.toString(array));
        System.out.println(t2-t1);


    }
}
