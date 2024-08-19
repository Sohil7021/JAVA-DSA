package graph.Graph_Exercise;

import graph.Graph;

public class main {
    public static void main(String[] args) {
        Graph myGraph = new Graph();
        myGraph.addVertex("A");
        myGraph.addVertex("B");

        myGraph.addEdge("A","B");
//        myGraph.removeEdge("A","B");
        myGraph.removeVertex("B");



        myGraph.printGraph();
    }
}
