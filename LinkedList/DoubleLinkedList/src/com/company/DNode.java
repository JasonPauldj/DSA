package com.company;

public class DNode {
    private int element;
    private DNode next, prev;

    public DNode(int e, DNode next, DNode prev){
        this.element = e;
        this.next=next;
        this.prev =prev;
    }

    public int getElement() {
        return element;
    }

    public DNode getNext() {
        return next;
    }

    public DNode getPrev() {
        return prev;
    }

    public void setElement(int element) {
        this.element = element;
    }

    public void setNext(DNode next) {
        this.next = next;
    }

    public void setPrev(DNode prev) {
        this.prev = prev;
    }
}
