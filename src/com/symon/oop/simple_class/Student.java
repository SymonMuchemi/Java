package com.symon.oop.simple_class;

import com.sun.source.tree.BreakTree;

public class Student {
    int age;
    String name;
    String address;

    public Student(String name, int age,String address) {
        this.age = age;
        this.name = name;
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String toString(){
        String details = "Name: " + this.name + "\nAge: " + this.age + "\nAddress: " + this.address;
        return details;
    }
}
