package com.symon.binarySearchTrees;

public class BinarySearchTree {
    Node root;
    /*
        insert - places a node at its correct position in the binary search tree
        @node: the node to be inserted
        Return: nothing
     */
    public void insert(Node node){
        root = insertHelper(root, node);
    }
    /*
        insertHelper - inserts a node following the binary search rules
        @root: the root node
        @node: the node to be inserted
        Return: nothing
     */
    private Node insertHelper(Node root, Node node){
        int data = node.data;

        if (root == null){
            root = node;
            return root;
        }
        else if (data < root.data){
            root.left = insertHelper(root.left, node);
        }
        else {
            root.right = insertHelper(root.right, node);
        }
        return root;
    }
    /*
        display - prints out the binary search tree
        Return: nothing
     */
    public void display(){
        displayHelper(root);
    }
    /*
        displayHelper - helper to the display() function
        @root: the root node
     */
    private void displayHelper(Node root){
        if (root != null){
            displayHelper(root.left);
            System.out.println(root.data);
            displayHelper(root.right);
        }
    }
    /*
        search - looks for an element in the bst
        @data: the data to be searched
        Return: true when data is found or false otherwise
     */
    public boolean search(int data){
        return searchHelper(root, data);
    }
    /*
        searchHelper - helper to search()
        @root: the root node
        @data: data to look for
        Return: true if data is found, false otherwise
     */
    private boolean searchHelper(Node root, int data){
        if (root == null){
            return false;
        }
        else if (root.data == data) {
            return true;
        }
        else if (root.data > data) {
            return searchHelper(root.left, data);
        } else {
            return searchHelper(root.right, data);
        }
    }
    /*
        remove - removes a node from the tree
        @data: data held by the node to be removed
        Return: nothing
     */
    public void remove(int data){
        if (search(data)){
            removeHelper(root, data);
        }
        else {
            System.out.println(data + " not found!");
        }
    }
    /*
        removeHelper - helper to remove()
        @root: the root node
        @data: the data held by the node to be removed
        Return: the removed node or null
     */
    private Node removeHelper(Node root,int data){
        if (root == null) {
            return null;
        } else if (data < root.data) {
            root.left = removeHelper(root.left, data);
        } else if (data > root.data) {
            root.right = removeHelper(root.right, data);
        } else {
            if (root.left == null && root.right == null){
                root = null;
            }
            else if (root.right != null){
                root.data = successor(root);
                root.right = removeHelper(root.right, root.data);
            }
            else {
                root.data = predecessor(root);
                root.left = removeHelper(root.left, root.data);
            }
        }
        return null;
    }
    /*
        successor - used to find the least value below the right child of a root node
        @root: the node
        Return: root data if found, 0 otherwise
     */
    private int successor(Node root){
        root = root.right;
        while (root.left != null){
            root = root.left;
        }
        return 0;
    }
    /*
        predecessor - used to find the greatest value below the left child of the root node
        @root: the node
        Return: root data if found, 0 otherwise
     */
    private int predecessor(Node root){
        root = root.left;
        while (root.right != null){
            root = root.right;
        }
        return 0;
    }
}
