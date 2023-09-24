package com.symon.threads;

public class MyThread extends Thread{
    // override
    public void run(){
        if (this.isDaemon()){
            System.out.println("This is a daemon running!");
        }
        else {
            System.out.println("This thread is a user thread");
        }
    }
}
