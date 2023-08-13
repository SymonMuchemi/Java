package com.symon;

import java.util.Hashtable;

public class WorkingWithHashTables {
    public static void main(String[] args) {

        Hashtable<Integer, String> hashtable = new Hashtable<>();

        hashtable.put(21, "Simon");
        hashtable.put(22, "Jackson");
        hashtable.put(26, "Mondlane");
        hashtable.put(71, "Mandela");
        hashtable.put(98, "Johnson");

        System.out.println("26 holds: " + hashtable.get(26));
        System.out.println("98 holds: " + hashtable.get(98));
        System.out.println();

        System.out.println("Table data");

        for (int key: hashtable.keySet()){
            System.out.println(key + " holds: " + hashtable.get(key));
        }
        System.out.println("Removing 21 - " + hashtable.remove(21) + "\n");
        for (int key: hashtable.keySet()){
            System.out.println(key + " holds: " + hashtable.get(key));
        }
    }
}
