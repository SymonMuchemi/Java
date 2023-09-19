package com.symon.streams;


import java.util.HashSet;
import java.util.Set;

public class AllAnyNoneMatch {
    public static void main(String[] args) {
        // set dont accepts duplicates
        Set<String> fruits = new HashSet<>();
        boolean containsOne;
        boolean allContainOne;
        boolean noneContainThree;

        fruits.add("One Apple");
        fruits.add("One Mango");
        fruits.add("More grapes");
        fruits.add("Two Apples");
        fruits.add("Two Guavas");

        /*
            anyMatch is used to check if at least one
            element in the stream matches the specified predicate
        */
        // check if there is an element that starts with "One"
        containsOne= fruits.stream().anyMatch(value -> value.startsWith("One"));
        System.out.println("containsOne = " + containsOne);

        /*
            allMatch is used to check if all the elements in the stream
            match the specified condition
        */
        // check if all elements start with a "one"
        allContainOne = fruits.stream().allMatch(value -> value.startsWith("One"));
        System.out.println("allContainOne = " + allContainOne);
        /*
            noneMatch is used to check if all elements don't match a
            certain condition
        */

        // check if all element don't start with "Three"
        noneContainThree = fruits.stream().noneMatch(value -> value.startsWith("Three"));
        System.out.println("noneContainThree = " + noneContainThree);
    }
}
