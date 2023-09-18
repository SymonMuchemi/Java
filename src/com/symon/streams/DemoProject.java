package com.symon.streams;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class DemoProject {
    public static void main(String[] args) {
        NumberGenerator num = new NumberGenerator();
        Integer[] MyArray = num.randomNumbers(16, 20);
        List<Integer> numbersList = Arrays.asList(MyArray);
        List<Integer> evenNumbers;
        long count;


        // goal - count the even numbers from the list of random numbers

        System.out.println("Array of random numbers");
        System.out.println(Arrays.toString(MyArray));

        evenNumbers = numbersList.stream().filter(x -> (x % 2) == 0).toList();
        count = numbersList.stream().filter(x -> (x % 2) == 0).count();
        System.out.println(evenNumbers);
        System.out.println(count);

        // retrieving the minimum and maximum objects
        /*
        ---long method----

        Optional<Integer> min = numbersList.stream().min((v1, v2) -> {
            return v1.compareTo(v2);
        });*/
        Optional<Integer> min = numbersList.stream().min(Integer::compareTo);
        System.out.println("min.get() = " + min.get());

        // getting the maximum value
        Optional<Integer> max = numbersList.stream().max(Integer::compareTo);

        System.out.println("max.get() = " + max.get());
    }
}


