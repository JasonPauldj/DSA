package com.company;

import java.util.Scanner;

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
        sList.addNode(new SListNode(9));
        sList.addNode(new SListNode(10));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the block");
        int sizeOfBlock = scanner.nextInt();

        sList.setHead(ReverseSList(sList.getHead(),sList,sList.getSize(),sizeOfBlock));
        System.out.println(sList.toString());

    }

    public static SListNode ReverseSList(SListNode headNode,SList sList, int sizeOfRecursiveList,int size ) {
        if(sizeOfRecursiveList< size){
            return headNode;
        }
        else
        {
            int iter=size;
            SListNode headForRecursiveList= headNode;
            while(iter!=0 && headForRecursiveList !=null){
                headForRecursiveList = headForRecursiveList.getNext();
                sizeOfRecursiveList--;
                //sList.setHead(sList.getHead().getNext());
                iter--;
            }
           // System.out.println("Calling with " + headForRecursiveList.getElement());
            SListNode nodeToConnect = ReverseSList(headForRecursiveList,sList,sizeOfRecursiveList,size);
           // System.out.println(nodeToConnect==null? true : false);
            SListNode leftNode = nodeToConnect;
            SListNode rightNode = headNode;
            SListNode temp=null;
            iter=size;
            while(iter!=0){
                //System.out.println("connecting node " + rightNode.getElement() + " to left node " + leftNode
                // .getElement());
                temp=rightNode.getNext();
                rightNode.setNext(leftNode);
                leftNode=rightNode;
                rightNode=temp;
                iter--;
            }
            return leftNode;
        }
    }
}
