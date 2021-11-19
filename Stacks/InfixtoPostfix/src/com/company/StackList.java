package com.company;
/*INFIX TO POSTFIX*/
public class StackList<E> {
    private int size;
    private SListNode<E> top;

    public StackList(){
        this.size=0;
        this.top = null;
    }

    public SListNode<E> getTop(){
        if(size==0){
            throw new IllegalStateException("The stack is empty");
        }
        return top;
    }

    public int getSize() {
        return size;
    }

    public void setTop(SListNode<E> top) {
        this.top = top;
    }

    public boolean IsEmpty(){
        return size==0;
    }

    public void push(SListNode<E> newNode){
        newNode.setNext(top);
        setTop(newNode);
        size++;
    }

    public SListNode<E> pop(){
        if(size==0)
            throw new IllegalStateException("The stacklist is empty. Underflow error");

        SListNode<E> temp = top;
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
            SListNode<E> currentNode = top;
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
