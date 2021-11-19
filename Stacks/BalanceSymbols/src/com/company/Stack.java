package com.company;

public class Stack<E> {
    private int size;
    private Node<E> top;

    public Stack(){
        this.size=0;
        this.top = null;
    }

    public Node<E> getTop(){
        if(size==0){
            throw new IllegalStateException("The stack is empty");
        }
        return top;
    }

    public int getSize() {
        return size;
    }

    public void setTop(Node<E> top) {
        this.top = top;
    }

    public void push(Node<E> newNode){
        newNode.setNext(top);
        setTop(newNode);
        size++;
    }

    public  boolean IsEmpty() {
        return size == 0;
    }

    public Node<E> pop(){
        if(size==0)
            throw new IllegalStateException("The stacklist is empty. Underflow error");

        Node<E> temp = top;
        setTop(top.getNext());
        size--;
        return temp;
    }

    public String toString(){
        String s="";
        if(size==0){
            s="There are no items in the stack";
            return s;
        }
        else {
            s="[";
            Node<E> currentNode = top;
            while(currentNode.getNext() != null){
                s+= currentNode.getElement() +";";
                currentNode= currentNode.getNext();
            }
            s+=currentNode.getElement();
            s+="]";
            return s;
        }
    }
}
