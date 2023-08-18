package com.symon.binarySearchTrees;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(new Node(25));
        tree.insert(new Node(5));
        tree.insert(new Node(205));
        tree.insert(new Node(55));
        tree.insert(new Node(88));
        tree.insert(new Node(2));

        tree.remove(202);
        tree.display();
        System.out.println(tree.search(2));
    }
}
