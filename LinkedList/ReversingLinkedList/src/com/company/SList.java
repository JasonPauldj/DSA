package com.company;

public class SList {
    private int size;
    private SListNode head;

    public SList (){
        this.size=0;
        this.head = null;
    }

    public SListNode getHead(){
        return head;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size=size;
    }

    public void setHead(SListNode head) {
        this.head = head;
    }

    public void addNode(SListNode newNode){
        SListNode tailNode = head;
        newNode.setNext(null);
        if(size!=0) {
            while (tailNode != null && tailNode.getNext() != null) {
                tailNode = tailNode.getNext();
            }
            tailNode.setNext(newNode);
        }
        else {
            head = newNode;
        }
        size++;
    }
    public SListNode getNode(int pos){
        //the numbering of the positions starts from 1 onwards. i.e pos==1 corresponds to head
        int iter =1;
        SListNode currentNode = head;
        while(iter < pos){
            currentNode=currentNode.getNext();
            iter++;
        }
        return  currentNode;
    }

    public String toString(){
        String s="";
        if(size==0){
            s="There are no items in the list";
            return s;
        }
        else {
            s="[";
            SListNode currentNode = head;
            while(currentNode.getNext() != null){
                s+= currentNode.getElement() +";";
                currentNode= currentNode.getNext();
            }
            s+=currentNode.getElement();
            s+="]";
            return s;
        }
    }
}
