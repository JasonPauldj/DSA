package com.company;

public class GenericTreeNode<E> {
    private E element;
    private GenericTreeNode<E> firstChild;
    private GenericTreeNode<E> nextSibling;

    public GenericTreeNode(E e)
    {
        this.element=e;
        firstChild=null;
        nextSibling=null;
    }

    public E getElement() {
        return element;
    }

    public GenericTreeNode<E> getFirstChild() {
        return firstChild;
    }

    public GenericTreeNode<E> getNextSibling() {
        return nextSibling;
    }

    public void setElement(E element) {
        this.element = element;
    }

    public void setFirstChild(E el) {
        GenericTreeNode<E> nodeFirstChild = new GenericTreeNode<>(el);
        this.firstChild = nodeFirstChild;
    }

    public void setNextSibling(E el) {
        GenericTreeNode<E> nodeNextSibling = new GenericTreeNode<>(el);
        this.nextSibling = nodeNextSibling;
    }
}
