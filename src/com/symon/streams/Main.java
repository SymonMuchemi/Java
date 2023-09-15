package com.symon.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(
                10, 15, 20, 30, 35, 40
        );
        List<Integer> evenNumbers;

        // Without using streams
        /*
        for (Integer number : numbers) {
            if (number % 2 == 0){
                evenNumbers.add(number);
            }
        }
        System.out.println(evenNumbers);
*/
        // using stream concept - with filter method
        evenNumbers =  numbers.stream().filter(n -> n % 2 ==0)
                .collect(Collectors.toList());
        System.out.println(evenNumbers);

        System.out.println("Numbers only divisible by 5 and 3");
        // Without assigning the resulting collection to a variable
        numbers.stream().filter(n -> (n % 5 == 0) && (n % 2 != 0)).forEach(System.out::println);

        // Example 2
        System.out.println("Example 2");
        List<String> names = Arrays.asList(
                "Simon",
                "Jeremiah",
                "Nebuchadnezzar",
                "Disney",
                "Franklin",
                "Churchill"
        );
        //goal: retrieve the names of length greater than 6 and less than 8
        List<String> longNames;

        longNames = names.stream().filter(name ->
                (name.length() >= 6))
                .collect(Collectors.toList());
        System.out.println("\nLong names:\n");
        longNames.forEach(System.out::println);

        System.out.println("\nRemoving NULL inside a collection\n");
        List<String> words = Arrays.asList(
                "Melon",
                null,
                "Juice",
                "Top",
                "Jump",
                null,
                null,
                "Good"
        );

        // Filtering and collecting
        List<String> wordsWithoutNulls = words.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.toList());

        System.out.println("Initial list with null values" );
        words.forEach(System.out::println);
        System.out.println("\nAfter filtering");
        wordsWithoutNulls.forEach(System.out::println);

        // filtering without collecting
        System.out.println();
        words.stream().filter(Objects::nonNull).forEach(System.out::println);
    }

}