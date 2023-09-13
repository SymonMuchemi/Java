package com.symon.generics;

public class Main {
    public static void main(String[] args) {
        GenericList<Integer> list = new GenericList<>();

        list.add(20);
        list.add(50);
        list.add(80);

        System.out.println(list.getItem(1));
    }
}
