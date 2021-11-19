package com.company;

public class Main {

    public static void main(String[] args) {
	  SList sList1= new SList();
        SList sList2= new SList();
        SList resList = new SList();

        //ADDING ELEMENTS TO LIST1
	    sList1.addNode(new SListNode(11));
        sList1.addNode(new SListNode(23));
        sList1.addNode(new SListNode(34));
        sList1.addNode(new SListNode(45));
        sList1.addNode(new SListNode(56));

        //ADDING ELEMENTS TO LIST2
        sList2.addNode(new SListNode(1));
        sList2.addNode(new SListNode(23));
        sList2.addNode(new SListNode(33));
        sList2.addNode(new SListNode(45));
        sList2.addNode(new SListNode(1235));

        SListNode node1 = sList1.getHead();
        SListNode node2 = sList2.getHead();

        while(node1 != null &&  node2 !=null){
            if(node1.getElement()==node2.getElement()){
                resList.addNode(new SListNode(node1.getElement()));
                node1=node1.getNext();
                node2=node2.getNext();
            }
            else if(node1.getElement() > node2.getElement()){
                node2=node2.getNext();
            }
            else {
                node1=node1.getNext();
            }
        }

        System.out.println(resList.toString());
    }
}
