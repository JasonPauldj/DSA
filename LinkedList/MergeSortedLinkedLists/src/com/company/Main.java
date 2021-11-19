package com.company;

public class Main {

    public static void main(String[] args) {
        SList sList1 = new SList();
        // ADD NODES TO THE SINGLY LINKED LIST
        sList1.addNode(new SListNode(10));
        sList1.addNode(new SListNode(25));
        sList1.addNode(new SListNode(35));
        sList1.addNode(new SListNode(45));

        SList sList2 = new SList();
        // ADD NODES TO THE SINGLY LINKED LIST
        sList2.addNode(new SListNode(8));
        sList2.addNode(new SListNode(28));
        sList2.addNode(new SListNode(42));
        SList sList3 = new SList();
        //ITERATIVE APPROACH
      /*

        SListNode p1 = sList1.getHead();
        SListNode p2 = sList2.getHead();

        while(p1!=null && p2!= null){
            if(p1.getElement() <= p2.getElement()){
                sList3.addNode(sList1.getAndRemoveHead());
                p1=sList1.getHead();
            }
            else
            {
                sList3.addNode(sList2.getAndRemoveHead());
                p2=sList2.getHead();
            }
        }
        while(p1==null & p2 != null){
            sList3.addNode(sList2.getAndRemoveHead());
            p2=sList2.getHead();
        }
        while(p2==null & p1 != null){
            sList3.addNode(sList1.getAndRemoveHead());
            p1=sList1.getHead();
        }

        System.out.println(sList3.toString());*/
        sList3.setHead(recursiveMerge(sList1.getHead(),sList2.getHead()));
        sList3.setSize(sList1.getSize()+sList2.getSize());
        System.out.println(sList3.toString());

    }

    public static SListNode recursiveMerge(SListNode node1, SListNode node2){
        SListNode returnResult = new SListNode(0);
        if(node1 == null)
            return node2;
        else if(node2==null)
            return node1;
        else
        {
            if(node1.getElement() <= node2.getElement()){
                returnResult.setElement(node1.getElement());
                returnResult.setNext(recursiveMerge(node1.getNext(),node2));
            }
            else
            {
                returnResult.setElement(node2.getElement());
                returnResult.setNext(recursiveMerge(node1,node2.getNext()));
            }

            return returnResult;

        }
    }
}
