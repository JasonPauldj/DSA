package com.company;

  public class SListNode {
    private int element;
    private SListNode next;

    public SListNode(int el) throws IllegalArgumentException{
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
