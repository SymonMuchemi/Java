package com.symon.streams;

import java.util.Arrays;
import java.util.List;

public class Count {
    public static void main(String[] args) {
        List<String> vehicleList = Arrays.asList(
                "Bus",
                "Mini-bus",
                "Lorry",
                "Mini-bus",
                "Bus",
                "van"
        );

        //count the number of distinct vehicles in the list
        long count = vehicleList.stream().distinct().count();

        System.out.printf("The are %d elements in the list\nThis include:\n", count);
        vehicleList.stream().distinct().forEach(System.out::println);
    }
}
