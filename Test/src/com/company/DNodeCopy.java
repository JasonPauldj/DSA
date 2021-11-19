package com.company;

public class DNodeCopy<E> implements Position<E>{
    private E element;
    private DNodeCopy<E> next, prev;

    public DNodeCopy(E e, DNodeCopy<E> next, DNodeCopy<E> prev){
        this.element = e;
        this.next=next;
        this.prev =prev;
    }

    public E element() {
        return element;
    }

    public DNodeCopy<E> getNext() {
        return next;
    }

    public DNodeCopy<E> getPrev() {
        return prev;
    }

    public void setElement(E element) {
        this.element = element;
    }

    public void setNext(DNodeCopy<E> next) {
        this.next = next;
    }

    public void setPrev(DNodeCopy<E> prev) {
        this.prev = prev;
    }
}
