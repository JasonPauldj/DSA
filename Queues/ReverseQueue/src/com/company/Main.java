package com.company;

import sun.misc.Queue;

/*
Give an algorithm for reversing a queue Q. To access the queue, we are only allowed to use the methods of queue ADT.
*
* */
public class Main {

    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<Integer>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        System.out.println(queue.toString());
    }

    public  static  void reverseQueue(Queue<Integer> queue){
        if(queue.isEmpty())
            return;
        else
        {
            try{
            int val = queue.dequeue();
            reverseQueue(queue);
            queue.enqueue(val);
            }
            catch (InterruptedException e){

            }

        }
    }
}
