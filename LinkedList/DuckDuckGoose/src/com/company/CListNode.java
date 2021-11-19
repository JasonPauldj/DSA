package com.company;

public class CListNode {
    private int element;
    private CListNode next;

    public CListNode(int e){
        this.element = e;
        this.next=this;
    }

    public int getElement() {
        return element;
    }

    public CListNode getNext() {
        return next;
    }

    public void setElement(int element) {
        this.element = element;
    }

    public void setNext(CListNode next) {
        this.next = next;
    }
}
