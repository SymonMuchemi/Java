package com.symon.streams;

import java.util.Random;

public class NumberGenerator {

    public NumberGenerator() {
    }

    // returns an array of random numbers given the size
    public Integer[] randomNumbers(int size, int limit){
        Random rand = new Random();
        Integer[] array = new Integer[size];

        for (int i = 0; i < size; i++) {
            array[i] = rand.nextInt(limit);
        }

        return array;
    }
}
