package com.company;

public class Node<E> {
    private E element;
    private Node<E> next;

    public Node(E el){
        this.element =el;
        this.next = null;
    }
    public E getElement() {
        return element;
    }
    public Node<E> getNext() {
        return next;
    }
    public void setElement(E element) {
        this.element = element;
    }
    public void setNext(Node<E> next) {
        this.next = next;
    }
}
