package com.symon;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {
    public static void bubbleSort(int[] array){
        int temp;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]){
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
    public static void bubbleSortReverse(int[] array){
        int temp;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] < array[j + 1]){
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] myArray = new int[20];
        Random random = new Random();

        // assign random values
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(20);
        }
        System.out.println("Unsorted array: " + Arrays.toString(myArray));

        bubbleSort(myArray);

        System.out.println("Sorted array: " + Arrays.toString(myArray));

        bubbleSortReverse(myArray);
        System.out.println("Reverse order: " + Arrays.toString(myArray));
    }
}
