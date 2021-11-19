package com.company;

public class IntStack implements Stack {
    int[] stack;
    int top;
    int size;
    int maxSize;

    public IntStack() {
        stack = new int[1];
        top = -1;
        size = 0;
        maxSize=1;
    }

    public int getSize() {
        return size;
    }

    public int getTop() {
        if(IsEmptyStack())
            throw new IllegalStateException("The stack is empty");
        return stack[top];
    }

    public int pop() {
        if (IsEmptyStack()) {
            throw new IllegalStateException("The stack is empty");
        } else {
            size--;
            return stack[top--];
        }
    }

    public void push(int val) {
        if (IsStackFull()) {
            int[] temp = new int[maxSize*2];
            maxSize = maxSize*2;
            for(int i=0;i<size;i++){
                temp[i]=stack[i];
            }
            temp[size]=val;
            stack=temp;
            top++;
            size++;
        } else {
            top++;
            size++;
            stack[top] = val;
        }
    }

    boolean IsEmptyStack() {
        if (size == 0)
            return true;
        return false;
    }

    boolean IsStackFull() {
        if (size == maxSize) {
            return true;
        } else {
            return false;
        }
    }

    public String toString(){
        String s="";
        if(IsEmptyStack()){
            s="The stack is empty";
            return s;
        }
        else {
            int iter=size-1;
            for(;iter>=0;iter--){
                s+=stack[iter];
                s+=";";
            }
            return s;
        }
    }
}
