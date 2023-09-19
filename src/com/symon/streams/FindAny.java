package com.symon.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindAny {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList(
                "One",
                "Two",
                "Three",
                "One"
        );

        Optional<String> someElement;
        someElement = stringList.stream().findAny();
        System.out.println("someElement = " + someElement.get());
    }
}
