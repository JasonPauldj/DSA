package com.company;

public class DNode<E> implements Position<E>{
    private E element;
    private DNode<E> next, prev;

    public DNode(E e, DNode<E> next, DNode<E> prev){
        this.element = e;
        this.next=next;
        this.prev =prev;
    }

    public E element() {
        return element;
    }

    public DNode<E> getNext() {
        return next;
    }

    public DNode<E> getPrev() {
        return prev;
    }

    public void setElement(E element) {
        this.element = element;
    }

    public void setNext(DNode<E> next) {
        this.next = next;
    }

    public void setPrev(DNode<E> prev) {
        this.prev = prev;
    }
}
