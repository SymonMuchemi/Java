package com.symon.data_structures.queues;

import java.util.LinkedList;
import java.util.Queue;

public class workingWithQueues {
    public static void main(String[] args) {
        // We can not call an instance of a queue because the Queue is not a
        // class rather it is an interface

        Queue<String> queue = new LinkedList<>();

        // .offer is used to enqueue - add an element at the tail of the queue
        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Ludwig");
        queue.offer("Morton");
        queue.offer("Stanley");
        queue.offer("Steve");
        queue.offer("Harold");

        System.out.printf("Top element: %s\n",queue.peek()); // Print out the head of the queue
        System.out.printf("Size: %d\n", queue.size());
        //.poll() is used to dequeue the queue
        queue.poll();
        queue.poll();
        queue.poll();
        System.out.printf("Top element: %s\n",queue.peek());
        System.out.printf("Size: %d\n", queue.size());
        System.out.println(queue.isEmpty());
        System.out.printf("Does queue contain \"James\"? %b\n", queue.contains("James"));
        System.out.printf("Does queue contain \"Harold\"? %b\n", queue.contains("Harold"));
    }

}
