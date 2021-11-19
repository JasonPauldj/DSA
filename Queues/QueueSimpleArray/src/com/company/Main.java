package com.company;

public class Main {

    public static void main(String[] args) {
        Queue<Integer> q = new Queue<Integer>();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.dequeue();
        q.dequeue();
        q.enqueue(6);
        q.enqueue(7);
        System.out.println(q.toString());
    }
}
