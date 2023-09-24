package com.symon.threads;

/* types of threads:
    * daemon threads
    * user defined threads
 */

public class Main {
    // a thread is a light weight sub-process
    // it is the smallest independent unit of a program
    // every java program contains at least one thread
    // a thread is created and controlled by the java.lang.Thread class
    public static void main(String[] args) {
//        System.out.print(Thread.activeCount());
        Thread.currentThread().setName("Main thread");
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());

        // checking the priority of a thread
//        System.out.println(Thread.currentThread().getPriority());

        // changing the priority of the current thread
//        Thread.currentThread().setPriority(2);
//        System.out.println(Thread.currentThread().getPriority());
//
//        //checking if thread is alive
//        System.out.println(Thread.currentThread().isAlive());
//
//        for (int i = 3; i > 0 ; i--) {
//            System.out.println("i = " + i);
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//        System.out.println("You are done!");

        // creating a new thread
        MyThread myThread = new MyThread();
        // setting myThread to be a daemon thread
        myThread.setDaemon(true);
        myThread.run();
        System.out.println(myThread.isAlive());

        // getting the name of the newly created thread
        System.out.println(myThread.getName());

        // naming the thread
        myThread.setName("New Thread");
        System.out.println("New thread name = " + myThread.getName());

        // by default, new threads have the same priority as the parent thread
        // setting a new priority
        myThread.setPriority(2);
        System.out.println(myThread.getPriority());

        // checking if main thread is a daemon thread
        System.out.println(Thread.currentThread().isDaemon());

        System.out.println(myThread.currentThread().isDaemon());

    }
}
