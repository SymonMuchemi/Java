package com.symon.breadthFirstSearch;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {
    ArrayList<Node> nodes = new ArrayList<>();
    int[][] matrix;
    Graph(int size){
        this.matrix = new int[size][size];
    }

    public boolean checkEdge(int src, int dest){
        return matrix[src][dest] == 1;
    }
    public void addEdge(int src, int des){
        matrix[src][des] = 1;
    }
    public void addNode(Node node){
        nodes.add(node);
    }
    public void printMatrix(){
        System.out.print("  ");
        for (Node node : nodes) {
            System.out.print(node.data + " ");
        }
        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(nodes.get(i).data + " ");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println( );
        }
        System.out.println();
    }
    public void breadthFirstSearch(int src){
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[matrix.length];

        queue.offer(src);
        visited[src] = true;

        while (queue.size() > 0){
            src = queue.peek();
            System.out.println(nodes.get(src).data + " = visited");

            for (int i = 0; i < 5; i++) {
                if (matrix[src][i] == 1 && !visited[i]){
                    queue.offer(i);
                    visited[i] = true;
                }
            }
            queue.poll();
        }
    }
}
