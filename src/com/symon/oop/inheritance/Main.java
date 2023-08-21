package com.symon.oop.inheritance;

public class Main {
    public static void main(String[] args) {
        Dog dog =new Dog("Zeus", 3, 4);

        System.out.println(dog.move());
        System.out.println(dog.bark());
        System.out.println(dog);
    }
}
