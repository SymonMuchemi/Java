package com.symon.adjacencyList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Graph {
    ArrayList<LinkedList<Node>> adjList;

    public Graph() {
        adjList = new ArrayList<>();
    }
    //TODO: GPT this part
    public void addNode(Node node){
        LinkedList<Node> currentList = new LinkedList<>();
        currentList.add(node);
        adjList.add(currentList);
    }
    public void addEdge(int src, int dst){
        LinkedList<Node> currentList = adjList.get(src);
        Node dstNode = adjList.get(dst).get(0);
        currentList.add(dstNode);
    }
    public boolean checkEdge(int src, int dst){
        LinkedList<Node> currentList = adjList.get(src);
        Node dstNode = adjList.get(dst).get(0);

        for (Node node : currentList) {
            if (node == dstNode){
                return true;
            }
        }
        return false;
    }
    public void printMatrix(){
        for (LinkedList<Node> nodes : adjList) {
            for (Node node : nodes) {
                System.out.print(node.data  + "->");
            }
            System.out.println();
        }
    }
}
