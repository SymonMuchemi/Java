package com.symon.threads;

public class Main {
    // a thread is a light weight sub-process
    // it is the smallest independent unit of a program
    // every java program contains at least one thread
    // a thread is created and controlled by the java.lang.Thread class
    public static void main(String[] args) {
//        System.out.print(Thread.activeCount());
        System.out.print(Thread.currentThread().getName());
    }
}
