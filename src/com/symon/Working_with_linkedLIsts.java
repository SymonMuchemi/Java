package com.symon;

import java.util.LinkedList;

public class Working_with_linkedLIsts {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        // Treating a linkedList as a stack
        linkedList.push("A");
        linkedList.push("B");
        linkedList.push("C");
        linkedList.push("D");
        linkedList.push("F");

        // Mimicking a queue
        linkedList.offer("M");
        linkedList.offer("O");
        linkedList.offer("N");

        // removing an element
        linkedList.remove("N");

        //removing the first element
        linkedList.removeFirst();

        // removing the last element
        linkedList.removeLast();

        System.out.println(linkedList);
        // Checking the first element
        System.out.printf("First element %s\n",linkedList.peekFirst());
        System.out.printf("Last element %s\n",linkedList.peekLast());
    }
}
