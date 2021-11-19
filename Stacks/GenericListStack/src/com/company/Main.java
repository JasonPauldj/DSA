package com.company;

public class Main {

    public static void main(String[] args) {
        StackList<Integer> stackList = new StackList<Integer>();
        stackList.push(new SListNode<Integer>(1));
        stackList.push(new SListNode<Integer>(2));
        stackList.push(new SListNode<Integer>(3));
        stackList.push(new SListNode<Integer>(4));

        System.out.println(stackList.pop().getElement());
        System.out.println(stackList.pop().getElement());
        System.out.println(stackList.getTop().getElement());
        System.out.println(stackList.getSize());



    }
}
