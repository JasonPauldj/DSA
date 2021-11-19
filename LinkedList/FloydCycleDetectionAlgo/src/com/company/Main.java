package com.company;

/*
* Links to refer - https://stackoverflow.com/questions/44685102/why-does-floyds-cycle-finding-algorithm-fail-for-certain-pointer-increment-spee
* https://stackoverflow.com/questions/2936213/explain-how-finding-cycle-start-node-in-cycle-linked-list-work
*
 */

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

        //CREATE A LOOP
        SListNode nodeAtCycleStart = sList.getNode(4);
        SListNode nodeAtCycleEnd = sList.getNode(8);
        nodeAtCycleEnd.setNext(nodeAtCycleStart);

        //FLOYD CYCLE DETECTION ALGORITHM

        SListNode slowPointer = sList.getHead();
        SListNode fastPointer = sList.getHead();

        boolean isCycleExist = false;

        while(fastPointer != null){
            fastPointer = fastPointer.getNext().getNext();
            slowPointer =slowPointer.getNext();
            if(fastPointer==slowPointer){
                isCycleExist=true;
                break;
            }
        }

        if(isCycleExist){
            System.out.println("A cycle exists");
            slowPointer=sList.getHead();
            int pos=1;
            while(slowPointer!= fastPointer){
                slowPointer=slowPointer.getNext();
                fastPointer=fastPointer.getNext();
                pos++;
            }
            System.out.println("the start of the cycle is at pos " + pos + " and the node value is " + slowPointer.getElement());
        }
        else {
            System.out.println("Cycle doesn't exist");
        }
    }
}
