package com.symon.oop.interfaces;

public class Main {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        Fish fish = new Fish();

        fish.hunt();
        fish.flee();
        rabbit.flee();
        hawk.hunt();
    }
}
