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

        sList = RecursiveReverseLinkedList(sList);

        System.out.println(sList.toString());
    }

    //iterative approach
    public static void ReverseLinkedList(SList sList){
        SListNode currentNode = sList.getHead();
        SListNode temp = null;

        while(currentNode != null){
            SListNode nextNode = currentNode.getNext();
            currentNode.setNext(temp);
            temp = currentNode;
            currentNode = nextNode;
        }
        sList.setHead(temp);
        return ;
    }

    public static SList RecursiveReverseLinkedList (SList sList){
        if(sList.getSize() ==1)
            return sList;
        else {
            SList recursiveSlist = new SList();
            recursiveSlist.setHead(sList.getHead().getNext());
            recursiveSlist.setSize(sList.getSize()-1);
            recursiveSlist = RecursiveReverseLinkedList(recursiveSlist);
            recursiveSlist.addNode(sList.getHead());
            return recursiveSlist;
        }

    }
}
