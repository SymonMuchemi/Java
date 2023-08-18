package com.symon.sorting;

import java.util.Arrays;
import java.util.Random;

public class SelectionSort {
    public static void selectionSort(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[i]){
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
    }
    public static void selectionSortReverse(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[j] > array[i]){
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[20];
        Random random = new Random();

        // inserting random elements
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(20);
        }

        // Print unsorted array
        System.out.println("Unsorted array: " + Arrays.toString(arr));

        // sort the array
        selectionSort(arr);

        //print sorted array
        System.out.println("Sorted array: " + Arrays.toString(arr));

        //sorted in descending order
        selectionSortReverse(arr);

        // Print reverse order
        System.out.println("Reverse order: " + Arrays.toString(arr));
    }
}
