package com.company;

public class DNode<E> {
    private E element;
    private DNode next, prev;

    public DNode(E e, DNode next, DNode prev){
        this.element = e;
        this.next=next;
        this.prev =prev;
    }

    public E getElement() {
        return element;
    }

    public DNode getNext() {
        return next;
    }

    public DNode getPrev() {
        return prev;
    }

    public void setElement(E element) {
        this.element = element;
    }

    public void setNext(DNode next) {
        this.next = next;
    }

    public void setPrev(DNode prev) {
        this.prev = prev;
    }
}
