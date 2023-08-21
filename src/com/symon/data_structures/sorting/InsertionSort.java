package com.symon.data_structures.sorting;

import java.util.Arrays;
import java.util.Random;

public class InsertionSort {
    public static void insertionSort(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]){
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
    }
    public static void insertionSortReverse(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] > array[j - 1]){
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = new int[20];
        Random random = new Random();

        // Element assignment
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20);
        }
        System.out.println("Before: " + Arrays.toString(array));

        //sorting
        insertionSort(array);
        System.out.println("After: " + Arrays.toString(array));

        // Reverse
        insertionSortReverse(array);
        System.out.println("After: " + Arrays.toString(array));
    }
}
