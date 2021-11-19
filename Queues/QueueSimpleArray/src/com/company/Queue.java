package com.company;

public class Queue <E>{
    static final int CAPACITY=5;
    int front;
    int rear;
    int size;
    E[] queue;
    public Queue(){
        front=0;
        rear=-1;
        size=0;
        queue= (E[])new Object[CAPACITY];
    }

    void enqueue(E v){
        if(isFullQueue()){
            throw new IllegalStateException("Overflow Error - the queue is full.");
        }
        else{
            rear=(rear==CAPACITY-1) ? 0 : ++rear;
            queue[rear]=v;
            size++;
        }
    }

    E dequeue(){
        if(isEmptyQueue()){
            throw new IllegalStateException("Underflow Error - the queue is empty.");
        }
        else{
            E retval = queue[front];
            front=(front==CAPACITY-1) ? 0 : ++front;
            size--;
            return  retval;
        }
    }

    boolean isEmptyQueue(){
        return size==0;
    }

    boolean isFullQueue(){
        return size==CAPACITY;
    }
    int queueSize(){
        return size;
    }

    public String toString(){
        String s="";
        int iter=1;
        int st=front;
        while(iter<=size){
            s+=queue[st]+";";
            st=(st==CAPACITY-1)?0:++st;
            iter++;
        }
        return s;
    }
}
