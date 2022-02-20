package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {
    private boolean[] marked;
    private int count;

    public BreadthFirstSearch(Graph G, int s) {
        marked = new boolean[G.V()];
        bfs(G, s);
    }

    private void bfs(Graph G, int s){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(s);
        marked[s]=true;
        while(!queue.isEmpty()){
            int v=queue.poll();
            for(int w: G.adj(v)){
                if(!marked[w]){
                    count++;
                    marked[w]=true;
                    queue.add(w);
                }
            }
        }
    }
}
