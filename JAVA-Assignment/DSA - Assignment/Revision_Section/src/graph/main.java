package graph;

public class main {
    public static void main(String[] args) {
        Graph myGraph = new Graph();
        myGraph.addVertex("A");
        myGraph.addVertex("B");
        myGraph.addVertex("C");
        myGraph.addVertex("D");

        myGraph.addEdge("A","B");
        myGraph.addEdge("A","C");
        myGraph.addEdge("B","D");
        myGraph.addEdge("B","D");
        myGraph.addEdge("C","D");

//        myGraph.removeEdge("A","B");

        myGraph.removeVertex("D");
        myGraph.printGraph();
    }
}
