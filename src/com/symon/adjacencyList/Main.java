package com.symon.adjacencyList;

public class Main {
    public static void main(String[] args) {
        com.symon.adjacencyList.Graph graph = new Graph();

        graph.addNode(new com.symon.adjacencyList.Node('A'));
        graph.addNode(new com.symon.adjacencyList.Node('B'));
        graph.addNode(new com.symon.adjacencyList.Node('C'));
        graph.addNode(new com.symon.adjacencyList.Node('D'));
        graph.addNode(new com.symon.adjacencyList.Node('E'));

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(4, 0);
        graph.addEdge(4, 2);

        graph.printMatrix();

        System.out.println(graph.checkEdge(0,2));
    }
}
