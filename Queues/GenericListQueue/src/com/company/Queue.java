package com.company;

public class Queue <E>{
    SListNode<E> front;
    SListNode<E> rear;
    int size;

    Queue(){
        front=null;
        rear=null;
        size=0;
    }

    public int size(){
        return size;
    }

    public void enqueue(E val){
        SListNode<E> newNode = new SListNode<E>(val);
        if(rear==null){
            rear=newNode;
            front=newNode;
        }
        else
        {
            rear.setNext(newNode);
            rear=rear.getNext();
        }
        size++;
    }

    public E dequeue(){
        if(isEmptyQueue())
            throw new IllegalStateException("Underflow error - the queue is empty");
        else
        {
            E temp = front.getElement();
            if(front==rear)
                rear=null;
            front=front.getNext();
            size--;
            return temp;
        }
    }

    public boolean isEmptyQueue(){
        return size==0;
    }

    public String toString(){
        String s;
        s="";
        if(size==0)
        {
            s="the queue is empty";
            return s;
        }
        int iter=1;
        SListNode<E> current=front;
        while(current !=null && iter <=size){
            s+=current.getElement()+";";
            current=current.getNext();
            iter++;
        }
        return s;
    }
}
