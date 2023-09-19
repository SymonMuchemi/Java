package com.symon.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamConcatenation {
    public static void main(String[] args) {
        List<String> animalList;
        List<String> birdsList;
        List<String> finalList;
        Stream<String> stream1;
        Stream<String> stream2;

        animalList = Arrays.asList(
                "Dog",
                "Cat",
                "Elephant"
        );
        birdsList = Arrays.asList(
                "Peacock",
                "Parrot",
                "Crow"
        );

        stream1 = animalList.stream();
        stream2 = birdsList.stream();

        finalList = Stream.concat(stream1, stream2).toList();

        System.out.println("finalList = " + finalList);
    }
}
