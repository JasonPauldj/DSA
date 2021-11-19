package com.company;

public class Main {

    public static void main(String[] args) {
	Dequeue<Integer> dequeue = new Dequeue<Integer>();
	    dequeue.addFirst(1);
        dequeue.addFirst(2);
        dequeue.addFirst(3);
        dequeue.addFirst(4);
        dequeue.addFirst(5);
        dequeue.addLast(6);
        dequeue.addLast(7);
        dequeue.addLast(8);
        dequeue.addLast(9);

        dequeue.removeFirst();
        dequeue.removeLast();

        System.out.println(dequeue);
    }
}
