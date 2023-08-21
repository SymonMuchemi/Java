package com.symon.oop.abstraction;

public class Human extends Ape{
    String name;

    public Human(String name) {
        this.name = name;
    }

    @Override
    void makeNoise() {
        System.out.println(this.name + " talks");
    }
    String move(){
        if (this.name.toLowerCase() == "man"){
            return (this.name + "'s movement is bipedal");
        }
        else if (this.name.toLowerCase() == "baboon"){
            return (this.name + "'s movement is bipedal and can be quadrupedal");
        }
        return null;
    }
}
