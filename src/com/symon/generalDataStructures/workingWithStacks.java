package com.symon.generalDataStructures;

import java.util.Stack;

public class workingWithStacks {
    // Stack is a LIFO data structure
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Minecraft");
        stack.push("JigSaw");
        stack.push("NFSMW");
        stack.push("NFS Carbon");
        stack.push("Asphalt Nitro");
        stack.push("Monopoly");
        System.out.println(stack.empty());
        System.out.println(stack);

        // removing the top-most object
        String topGame = stack.pop();
        System.out.println(stack);

        System.out.println("The removed game = " + topGame);

        // See the item on top of the stack
        String onTop = stack.peek();
        System.out.printf("Top item: %s", onTop);

        // searching for an item in the stack
        System.out.printf("Monopoly is at index %d\n", stack.search("Monopoly"));
        System.out.printf("NFSMW is at index %d\n", stack.search("NFSMW"));
        System.out.printf("PUBG is at index %d", stack.search("PUBG"));

    }
}
