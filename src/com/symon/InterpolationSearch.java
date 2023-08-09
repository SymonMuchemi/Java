package com.symon;

public class InterpolationSearch {
    public static void main(String[] args) {
        int[] arr = new int[100];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        int target = 24;
        int index;
        index = interpolationSearch(arr, target);

        if (index != -1){
            System.out.printf("%d found at index %d\n", target, index);
        }else {
            System.out.println(target + "not found!");
        }
    }
    public static int interpolationSearch(int[] array, int value){
        int high = array.length -1;
        int low = 0;
        int probe;

        while ((array[low] <= value) && (value <= array[high]) && (low <= high)){
            probe = low + (high - low) * (value - array[low]) / (array[high] - array[low]);

            if (array[probe] == value) return probe;
            else if (array[probe] < value) low = probe + 1;
            else high = probe + 1;
        }
        return -1;
    }
}
