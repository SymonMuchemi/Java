package com.symon;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class priorityQueues {
    /*
    * Priority queues are similar to queues but elements
    * have priority values
    * */
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        queue.offer("D");
        queue.offer("C");
        queue.offer("V");
        queue.offer("X");
        queue.offer("A");

        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
