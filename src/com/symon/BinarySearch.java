package com.symon;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        int target = 92;
        int index = binSearch(array, target);
        if (index != -1)
            System.out.printf("%d found at index: %d", target, index);
        else
            System.out.printf("%d not found", target);
    }
    public static int binSearch(int[] array, int target){
        int low = 0;
        int high = array.length;
        int mid, value;

        if (target > array[array.length -1])
            return -1;

        while (low <= high){
            mid = (low + high) / 2;
            value = array[mid];

            System.out.printf("Middle: %d\n", value);
            if (value > target){
                high = mid - 1;
            }
            else if (value < target) {
                low = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
