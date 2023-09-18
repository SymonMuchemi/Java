package com.symon.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Limit {
    public static void main(String[] args) {
        List<String> vehicleList = Arrays.asList(
                "Lorry",
                "Bus",
                "Lorry",
                "Bus",
                "Mini-bus",
                "Bus",
                "Lorry",
                "Mini-bus",
                "Bus",
                "van"
        );
        List<String> limitedVehicleList;
        // limiting the size of the elements to collect or manipulate
        limitedVehicleList = vehicleList.stream()
                                        .limit(5)
                                        .collect(Collectors.toList());

        System.out.println("The list is limited to only three items:");
        System.out.println(limitedVehicleList);
    }
}
