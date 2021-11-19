package com.company;

public class Main {

    public static void main(String[] args) {
	JosephusCircle josephusCircle = new JosephusCircle(14,2);
	CListNode remainingNode = josephusCircle.executeElimination();

        System.out.println(remainingNode.getElement());
    }
}
