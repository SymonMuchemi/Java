package com.symon.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reduce {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList(
                "Melon",
                "Jello",
                "Mango",
                "Peach"
        );

        // the reduce method is used to perform binary operations
        Optional<String> reduce = stringList.stream().reduce((value, combinedValue) -> combinedValue + value);
        System.out.println("reduce = " + reduce);
    }
}
