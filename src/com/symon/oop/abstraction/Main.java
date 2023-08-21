package com.symon.oop.abstraction;

public class Main {
    public static void main(String[] args) {
        Ape ape = new Human("man");
        System.out.println(ape.move());
        ape.makeNoise();
        ape.Show();
    }
}
