package com.company;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**Given an integer k and a queue of integers, how do you reverse the order of the
 first k elements of the queue, leaving the other elements in the same relative order? For
 example, if k=4 and queue has the elements [10, 20, 30, 40, 50, 60, 70, 80, 90]; the output
 should be [40, 30, 20, 10, 50, 60, 70, 80, 90]*/
public class Main {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);

        Stack<Integer> stack = new Stack<>();

        int k=3;
        int iter=1;
        while(iter<=k){
                stack.push(queue.remove());
                iter++;
        }
        iter=1;
        while(!stack.isEmpty()){
            queue.add(stack.pop());
        }
        while(iter<=queue.size()-k)
        {
            queue.add(queue.remove());
            iter++;
        }
        System.out.println(queue);
    }
}
