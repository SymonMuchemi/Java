package com.symon.oop.inheritance;

public class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String move(){
        return (this.name + " is moving");
    }

}
