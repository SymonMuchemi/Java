package com.symon.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Filter {
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

        List<Person> people = List.of(
                new Person("Simon Muchemi", 20, Gender.MALE),
                new Person("Franklin Roosevelt", 80, Gender.MALE),
                new Person("Booker T Washington", 50, Gender.MALE),
                new Person("D.E.B Du Bois", 55, Gender.MALE),
                new Person("Marylynne Monroe", 45, Gender.FEMALE),
                new Person("Jane Doe", 59, Gender.FEMALE),
                new Person("Jeniffer Lopez", 59, Gender.FEMALE)
        );

        List<Person> oldPeople = people.stream().filter(elder -> elder.age > 50).collect(Collectors.toList());

        System.out.println("Elders");
        oldPeople.forEach(elder -> System.out.println(elder.name + elder.gender + elder.age));
     }

}