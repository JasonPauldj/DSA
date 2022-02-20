package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class TopologicalSort {

    private Queue<Integer> vertices;
    private Queue<Integer> topologicalOrder;
    int cntVertices;

    public TopologicalSort(DiGraph G) {
        vertices = new LinkedList<Integer>();
        topologicalOrder = new LinkedList<>();
        for (int i=0; i < G.V() ; i++) {
            if (G.indegree[i] == 0)
                vertices.add(i);
        }
        topologicalSort(G);
    }

    private void topologicalSort(DiGraph G) {
        while (!vertices.isEmpty()) {
            int v = vertices.poll();
            topologicalOrder.add(v);
            cntVertices++;
            for (int w : G.adj(v)) {
                if (--G.indegree[w] == 0)
                    vertices.add(w);
            }
        }

        if(cntVertices != G.V()){
            System.out.println("circle exists");
        }

        else {
            System.out.println("topological order is");
            while(!topologicalOrder.isEmpty())
            {
                System.out.println(topologicalOrder.poll());
            }
        }

    }

}
