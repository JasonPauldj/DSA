package com.company;

public class Main {

    public static void main(String[] args) {
        SList sList = new SList();
        // ADD NODES TO THE SINGLY LINKED LIST
        sList.addNode(new SListNode(1));
        sList.addNode(new SListNode(2));
        sList.addNode(new SListNode(3));
        sList.addNode(new SListNode(4));
        sList.addNode(new SListNode(5));
        sList.addNode(new SListNode(6));
        sList.addNode(new SListNode(7));
        sList.addNode(new SListNode(8));

        SListNode middleNode = sList.getHead();
        SListNode currentNode = sList.getHead();
        int cnt = 1;
        int pos = 1;
        //
        while (currentNode != null && currentNode.getNext() != null) {
            if (cnt %2 == 1 && cnt > 2) {
                middleNode = middleNode.getNext();
                pos++;
            }
            currentNode = currentNode.getNext();
            cnt++;
        }

        System.out.println("The middle node is at pos " + pos + " and has a value " + middleNode.getElement());
    }
}
