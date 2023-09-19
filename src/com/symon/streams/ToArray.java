package com.symon.streams;

import java.util.Arrays;
import java.util.List;

public class ToArray {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList(
                "A",
                "B",
                "C",
                "1",
                "2",
                "3"
        );

        Object[] arr = stringList.stream().toArray();
        System.out.println(Arrays.toString(arr));
    }
}
