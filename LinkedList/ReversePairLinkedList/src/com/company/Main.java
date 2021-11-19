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

        SListNode tempHead = sList.getHead();
       // sList.setHead(sList.getHead().getNext());

       sList.setHead(ReverseNodes(sList.getHead(), sList.getHead().getNext()));

        System.out.println(sList.toString());

    }

    public static SListNode ReverseNodes(SListNode node1, SListNode node2) {
        if (node1 == null || node2 == null) {
            return node1==null?node2:node1;
        }
        else{
        //System.out.println("P - node1 " + node1.getElement() + " node2 " + node2.getElement());
        SListNode nodeToConnect = ReverseNodes(node2.getNext(),  node2.getNext()==null?null:node2.getNext().getNext() );
        node1.setNext(nodeToConnect);
        node2.setNext(node1);
        return node2;
        }
    }
}
