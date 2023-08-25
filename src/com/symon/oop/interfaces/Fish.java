package com.symon.oop.interfaces;

public class Fish implements Prey, Preditor{
    @Override
    public void hunt() {
        System.out.println("This fish is hunting small fishes");
    }

    @Override
    public void flee() {
        System.out.println("This fish is fleeing from larger fishes");
    }
}
