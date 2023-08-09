package com.symon;

import java.util.Arrays;
import java.util.Random;

public class LinearSearch {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        int index;

        for (int i = 0; i < 10; i++) {
            array[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(array));

        index = linearSearch(array, 9);

        if (index != -1) System.out.println("Element found at index: " + index);
        else System.out.println("Element not found!");
    }

    private static int linearSearch(int[] array, int num) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) return i;
        }
        return -1;
    }
}
