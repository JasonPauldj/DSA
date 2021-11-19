package com.company;

import java.util.Stack;

public class Main {
    static Stack<BTNode> stack1 = new Stack<>();
    static Stack<BTNode> stack2 = new Stack<>();
    public static void main(String[] args) {
        BTree tree = new BTree(1);
        tree.root().setLeft(6000);
        tree.root().setRight(333);
        tree.root().left().setLeft(34);
        tree.root().left().setRight(55);
        tree.root().right().setLeft(380);
        tree.root().right().setRight(20);
        tree.root().right().right().setRight(10);


        stack1.push(tree.root());

        EmptyStack1();

    }

    public static void EmptyStack1(){
        while(!stack1.isEmpty()){
            BTNode temp = stack1.pop();
            System.out.print(temp.element()+";");
            if(temp.left() != null)
                stack2.push(temp.left());
            if(temp.right() != null)
                stack2.push(temp.right());
        }

        if(!stack2.isEmpty())
            EmptyStack2();
    }

    public static void EmptyStack2(){
        while(!stack2.isEmpty()){
            BTNode temp = stack2.pop();
            System.out.print(temp.element()+";");
            if(temp.right() != null)
                stack1.push(temp.right());
            if(temp.left() != null)
                stack1.push(temp.left());
        }
        if(!stack1.isEmpty())
            EmptyStack1();
    }
}
