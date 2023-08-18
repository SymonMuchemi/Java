package com.symon.adjacencyMatrix;

import java.util.ArrayList;

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
    public void DepthFirstSearch(int src){
        boolean[] visited = new boolean[matrix.length];
        DFSHelper(src, visited);
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
    public void DFSHelper(int src, boolean[] visited){
        if (visited[src]){
            return;
        }
        else {
            visited[src] = true;
            System.out.println(nodes.get(src).data + " = visited");
        }
        for (int i = 0; i < matrix[src].length; i++) {
            if (matrix[src][i] == 1){
                DFSHelper(i, visited);
            }
        }
    }


}