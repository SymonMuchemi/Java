package com.symon;

import java.util.Arrays;

public class TestArrays {
    public static void main(String[] args) {
        String[] colors = new String[5];

        colors[0] = "Purple";
        colors[1] = "Blue";
        colors[2] = "Red";
        // printing all the elements in an array
        System.out.println(Arrays.toString(colors));
        // printing specific elements
        System.out.println(colors[0]);
        // Reassigning values
        colors[1] = "Indigo";
        System.out.println(colors[1]);

        int[] numbers = {100, 200};

        //looping through arrays
        for (String color : colors) {
            System.out.println(color);
        }
        System.out.println("Reversed");
        for (int i = colors.length - 1; i >= 0; i--) {
            System.out.println(colors[i]);
        }
    }
}