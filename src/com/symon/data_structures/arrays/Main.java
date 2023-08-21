package com.symon.data_structures.arrays;

public class Main {
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray(5);
        DynamicArray D_Array = new DynamicArray();
        D_Array.add(1);
        D_Array.add(2);
        D_Array.add(3);

        System.out.printf("D_Array elements: %d", D_Array.toString());
        System.out.println(dynamicArray.capacity);
        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        dynamicArray.add("D");
        dynamicArray.add("E");
        dynamicArray.add("F");

        /*dynamicArray.insert(0, "X");
        dynamicArray.insert(2, "W");*/

        dynamicArray.delete("A");
        dynamicArray.delete("B");
        dynamicArray.delete("C");
        System.out.println((dynamicArray.search("C")));

        System.out.println(dynamicArray);
        System.out.printf("Size: %d\n", dynamicArray.size);
        System.out.printf("Capacity: %d\n", dynamicArray.capacity);
        System.out.println("Empty: " + dynamicArray.isEmpty());
    }
}
