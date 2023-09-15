package com.symon.streams;

import java.util.Arrays;
import java.util.List;

public class Map {
    public static void main(String[] args) {

        final double PI = 3.142;

        List<String> names = Arrays.asList(
                "Simon",
                "Jeremiah",
                "Nebuchadnezzar",
                "Disney",
                "Franklin",
                "Churchill"
        );
        List<Person> personList = List.of(
                new Person("Simon Muchemi", 20, Gender.MALE),
                new Person("Franklin Roosevelt", 80, Gender.MALE),
                new Person("Booker T Washington", 50, Gender.MALE),
                new Person("D.E.B Du Bois", 55, Gender.MALE),
                new Person("Marylynne Monroe", 45, Gender.FEMALE),
                new Person("Jane Doe", 59, Gender.FEMALE),
                new Person("Jeniffer Lopez", 59, Gender.FEMALE)
        );
        List<Integer> radii = Arrays.asList(10, 28, 14, 77);
        List<String>upperCaseNames;
        List<Double> areas;

        // changing the names to uppercase using stream map
        upperCaseNames = names.stream().map(String::toUpperCase).toList();
        System.out.println(upperCaseNames);

        // the length of elements in a collection
        List<Integer> lengths = names.stream().map(element -> element.length()).toList();
        List<Integer> lengths_Shortened = names.stream().map(String::length).toList();

        lengths.forEach(System.out::println);
        lengths_Shortened.forEach(System.out::println);

        // Performing operations on each number in a list
        // calculating the circular areas given the radii

        areas = radii.stream().map(radius -> Math.pow(radius, 2) * PI).toList();
        System.out.println(areas);

        // combining filter and map
        // getting names of all persons older than 30 yrs and printing their names
        List<String> oldFolks = personList.stream()
                                            .filter(person -> person.age > 30)
                                            .map(person -> person.name)
                                            .toList();
        System.out.println("oldFolks:");
        oldFolks.forEach(System.out::println);
    }

}
