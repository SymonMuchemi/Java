package com.symon.streams;

import java.util.Arrays;
import java.util.List;

public class Map {
    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "Simon",
                "Jeremiah",
                "Nebuchadnezzar",
                "Disney",
                "Franklin",
                "Churchill"
        );

        // changing the names to uppercase using stream map
        List<String>upperCaseNames = names.stream().map(String::toUpperCase).toList();
        System.out.println(upperCaseNames);
    }

}
