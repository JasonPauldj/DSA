package com.company;

public class Main {

    public static void main(String[] args) {

        DiGraph diGraph = new DiGraph(8);
        diGraph.addEdge(0,1);
        diGraph.addEdge(2,1);
        diGraph.addEdge(1,3);
        diGraph.addEdge(1,4);
        diGraph.addEdge(0,6);
        diGraph.addEdge(6,4);
        diGraph.addEdge(1,5);
        diGraph.addEdge(7,6);
        diGraph.addEdge(7,5);

        TopologicalSort topologicalSort = new TopologicalSort(diGraph);

    }
}
