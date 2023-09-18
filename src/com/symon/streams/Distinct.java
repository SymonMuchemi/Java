package com.symon.streams;

import java.util.Arrays;
import java.util.List;

public class Distinct {
    public static void main(String[] args) {
        List<String> vehicleList = Arrays.asList(
                "Bus",
                "Mini-bus",
                "Lorry",
                "Mini-bus",
                "Bus",
                "van"
                );
        // getting the distinct objects in the list
        vehicleList.stream().distinct().map(String::toUpperCase).forEach(System.out::println);
    }
}
