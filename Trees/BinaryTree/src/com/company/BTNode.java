package com.company;

public class BTNode<E> {
    private E element;
    private BTNode<E> left;
    private BTNode<E> right;

    public BTNode(E element){
        this.element=element;
        this.left=null;
        this.right=null;
    }
    public E element(){
        return element;
    }
    public BTNode<E> left() {
        return left;
    }

    public BTNode<E> right() {
        return right;
    }

    public void setLeft(E el) {
        BTNode<E> newNode = new BTNode<E>(el);
        this.left = newNode;
    }

    public void setRight(E el) {
        BTNode<E> newNode = new BTNode<E>(el);
        this.right = newNode;
    }
}
