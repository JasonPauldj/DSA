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

        System.out.println(sList.getHead() );
       // PrintLinkedListReverse(sList.getHead());
    }

    public  static void PrintLinkedListReverse(SListNode currentNode){
        if(currentNode==null)
            return;

        PrintLinkedListReverse(currentNode.getNext());
        System.out.println(currentNode.getElement() + ";");
        return;
    }
}
