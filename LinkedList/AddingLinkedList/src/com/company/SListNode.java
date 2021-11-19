package com.company;

public class SListNode {
    private int element;
    private SListNode next;

    public SListNode(int el) throws IllegalArgumentException{
        if(el < 0 || el > 10){
            throw new IllegalArgumentException("This value is invalid");
        }
        this.element =el;
        this.next = null;
    }
    public int getElement() {
        return element;
    }
    public SListNode getNext() {
        return next;
    }
    public void setElement(int element) {
        this.element = element;
    }
    public void setNext(SListNode next) {
        this.next = next;
    }
}
