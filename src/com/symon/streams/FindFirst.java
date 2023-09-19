package com.symon.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirst {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList(
                "First element",
                "Two",
                "Three",
                "One"
        );

        Optional<String> firstElement = stringList.stream().findFirst();
        System.out.println("firstElement = " + firstElement.get());
    }
}
