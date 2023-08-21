package com.symon.data_structures.sorting;

import java.util.Arrays;
import java.util.Random;

public class Quicksort {
    public static void quicksort(int[] array, int start, int end){
        if (end <= start)
            return;

        int pivot = partition(array, start, end);
        quicksort(array, start, pivot - 1);
        quicksort(array, pivot + 1, end);
    }
    public static void quicksortReverse(int[] array, int start, int end){
        if (end <= start)
            return;

        int pivot = partitionReverse(array, start, end);
        quicksortReverse(array, start, pivot - 1);
        quicksortReverse(array, pivot + 1, end);
    }

    private static int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int i = start - 1;

        for (int j = start; j <= end; j++) {
            if (array[j] < pivot) {
                i++;
                int temp = array[j];
                array[j] = array[i];
                array[i] = temp;
            }
        }
        i++;
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;

        return i;
    }
    private static int partitionReverse(int[] array, int start, int end) {
        int pivot = array[end];
        int i = start - 1;

        for (int j = start; j <= end; j++) {
            if (array[j] > pivot) {
                i++;
                int temp = array[j];
                array[j] = array[i];
                array[i] = temp;
            }
        }
        i++;
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;

        return i;
    }

    public static void main(String[] args) {
        int[] myArr = new int[20];
        Random random = new Random();

        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = random.nextInt(1, 21);
        }
        System.out.println("Before: " + Arrays.toString(myArr));

        quicksort(myArr, 0, myArr.length - 1);
        System.out.println("After: " + Arrays.toString(myArr));

        quicksortReverse(myArr, 0, myArr.length - 1);
        System.out.println("Reversed: " + Arrays.toString(myArr));
    }
}
