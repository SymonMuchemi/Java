package com.symon.streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class FlatMap {
    public static void main(String[] args) {
        System.out.println("Using flatMap");
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> list2 = Arrays.asList(5, 6, 7, 8);
        List<Integer> list3 = Arrays.asList(9, 10, 11, 12);

        // using flatMap to join the lists
        List<List<Integer>> finalList = Arrays.asList(list1, list2, list3);
        List<Integer> combinedList;
        /*
        Using .stream
        combinedList = finalList.stream()
                                                .flatMap(list -> list.stream())
                                                .toList();
        */

        // shorter method
        combinedList = finalList.stream().flatMap(Collection::stream).toList();

        System.out.println("Final and combined list:");
//        combinedList.forEach(System.out::println);
        System.out.println(combinedList);
    }
}
