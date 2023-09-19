package com.symon.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Sort {
    public static void main(String[] args) {
        NumberGenerator numGen = new NumberGenerator();

        Integer[] array = numGen.randomNumbers(10, 50);
        List<Integer> list1 = Arrays.asList(array);
        List<Integer> sortedList;
        List<Integer> reverseSortedList;

        // strings
        List<String> stringList;
        List<String> sortedStringList;
        List<String> reverseSortedStringList;

        stringList = Arrays.asList(
                "John",
                "James",
                "Allan",
                "Winston",
                "Churchill",
                "Bruno",
                "Zack",
                "Jeremy"
                );

        sortedStringList = stringList.stream().sorted().toList();
        reverseSortedStringList = stringList.stream().sorted(Comparator.reverseOrder()).toList();

        sortedList = list1.stream().sorted().toList();
        reverseSortedList = list1.stream().sorted(Comparator.reverseOrder()).toList();


        System.out.println("list1 = " + list1);
        System.out.println("sortedList = " + sortedList);
        System.out.println("reverseSortedList = " + reverseSortedList);

        System.out.println("Strings");
        System.out.println("stringList = " + stringList);
        System.out.println("sortedStringList = " + sortedStringList);
        System.out.println("reverseSortedStringList = " + reverseSortedStringList);
    }
}
