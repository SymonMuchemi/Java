package com.symon.sorting;

import java.util.Arrays;
import java.util.Random;

public class MergeSort {
    public static void mergeSort(int[] array){
        int length = array.length;

        //Base case
        if (length <= 1){
            return;
        }

        int j = 0;
        int middle = length / 2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];

        // Dividing array int to two sub-arrays
        for (int i = 0; i < length; i++) {
            if (i < middle){
                leftArray[i] = array[i];
            }
            else {
                rightArray[j] = array[i];
                j++;
            }
        }

        // recursive calls
        mergeSort(leftArray);
        mergeSort(rightArray);

        //combine sub-arrays
        merge(leftArray, rightArray, array);
    }
    public static void merge(int[] leftArray, int[] rightArray, int[] array){
        int leftArraySize = array.length / 2;
        int rightArraySize = array.length - leftArraySize;
        int i = 0, l = 0, r = 0;

        while ((l < leftArraySize) && (r < rightArraySize)){
            if (leftArray[l] < rightArray[r]){
                array[i] = leftArray[l];
                i++;
                l++;
            }
            else {
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }

        //combining the two sub-arrays
        while(l < leftArraySize){
            array[i] = leftArray[l];
            i++;
            l++;
        }
        while (r < rightArraySize){
            array[i] = rightArray[r];
            i++;
            r++;
        }
    }
    public static void mergeSortReverse(int[] array){
        int length = array.length;

        //Base case
        if (length <= 1){
            return;
        }

        int j = 0;
        int middle = length / 2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];

        // Dividing array int to two sub-arrays
        for (int i = 0; i < length; i++) {
            if (i < middle){
                leftArray[i] = array[i];
            }
            else {
                rightArray[j] = array[i];
                j++;
            }
        }

        // recursive calls
        mergeSortReverse(leftArray);
        mergeSortReverse(rightArray);

        //combine sub-arrays
        mergeReverse(leftArray, rightArray, array);
    }
    public static void mergeReverse(int[] leftArray, int[] rightArray, int[] array){
        int leftArraySize = array.length / 2;
        int rightArraySize = array.length - leftArraySize;
        int i = 0, l = 0, r = 0;

        while ((l < leftArraySize) && (r < rightArraySize)){
            if (leftArray[l] > rightArray[r]){
                array[i] = leftArray[l];
                i++;
                l++;
            }
            else {
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }

        //combining the two sub-arrays
        while(l < leftArraySize){
            array[i] = leftArray[l];
            i++;
            l++;
        }
        while (r < rightArraySize){
            array[i] = rightArray[r];
            i++;
            r++;
        }
    }

    public static void main(String[] args) {
        int[] myArray = new int[20];
        Random rand = new Random();

        // Filling the array with random numbers
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = rand.nextInt(10);
        }
        System.out.println("Before: " + Arrays.toString(myArray));

        //sort and print
        mergeSort(myArray);
        System.out.println("After: " + Arrays.toString(myArray));

        // Reverse order
        mergeSortReverse(myArray);
        System.out.println("Reversed: " + Arrays.toString(myArray));
    }
}
