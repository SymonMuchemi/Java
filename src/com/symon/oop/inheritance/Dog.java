package com.symon.oop.inheritance;

public class Dog extends Animal{
    int legs;

    public Dog(String name, int age, int legs) {
        super(name, age);
        this.legs = legs;
    }
    public String bark(){
        return (this.name + " is barking!");
    }

    public String toString() {
        return ("Name: " + this.name + "\nAge: " + this.age + "\nNumber of legs: " + this.legs);
    }
}
