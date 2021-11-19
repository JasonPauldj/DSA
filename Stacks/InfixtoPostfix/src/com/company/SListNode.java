package com.company;

public class SListNode<E> {
    private E element;
    private SListNode<E> next;

    public SListNode(E el){
        this.element =el;
        this.next = null;
    }
    public E getElement() {
        return element;
    }
    public SListNode<E> getNext() {
        return next;
    }
    public void setElement(E element) {
        this.element = element;
    }
    public void setNext(SListNode<E> next) {
        this.next = next;
    }
}
