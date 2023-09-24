package com.symon.threads;

import javax.swing.plaf.TableHeaderUI;

public class Main {
    // a thread is a light weight sub-process
    // it is the smallest independent unit of a program
    // every java program contains at least one thread
    // a thread is created and controlled by the java.lang.Thread class
    public static void main(String[] args) {
//        System.out.print(Thread.activeCount());
        Thread.currentThread().setName("Main thread");
        System.out.println(Thread.currentThread().getName());

        // checking the priority of a thread
//        System.out.println(Thread.currentThread().getPriority());

        // changing the priority of the current thread
        Thread.currentThread().setPriority(2);
        System.out.println(Thread.currentThread().getPriority());
    }
}
