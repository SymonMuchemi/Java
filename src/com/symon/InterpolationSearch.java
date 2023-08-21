package com.symon;

import java.util.Arrays;

public class InterpolationSearch {
    public static void main(String[] args) {
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.pow(2, i);
        }
        int target = 256;
        int index;
        index = interpolationSearch(arr, target);
        System.out.println(Arrays.toString(arr));

        if (index != -1){
            System.out.printf("%d found at index %d\n", target, index);
        }else {
            System.out.println(target + " not found!");
        }
    }
    public static int interpolationSearch(int[] array, int value){
        int high = array.length -1;
        int low = 0;
        int probe;

        while ((array[low] <= value) && (value <= array[high]) && (low <= high)){
            probe = low + (high - low) * (value - array[low]) / (array[high] - array[low]);
            System.out.printf("Probe: %d\n", probe);

            if (array[probe] == value) return probe;
            else if (array[probe] < value) low = probe + 1;
            else high = probe + 1;
        }
        return -1;
    }
}
