package com.company;

public class IntStack implements Stack {
    int[] stack;
    int top;
    int size;

    public IntStack() {
        stack = new int[maxSize];
        top = -1;
        size = 0;
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
            throw new IllegalStateException("The stack is full");
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


