package com.company;

import java.util.Stack;

public class Main {
    static BTNode p;
    static Stack<BTNode> stackNodes = new Stack<>();

    public static void main(String[] args) {
        BTree tree = new BTree(1000);
        tree.root().setLeft(23);
        tree.root().setRight(3);
        tree.root().left().setLeft(34);
        tree.root().left().setRight(55);

       // System.out.println(tree.getMax());
       inOrderNonRecursion(tree.root());

    }

    public static BTNode preOrderSuccessor(BTNode n)
    {
        if(n!=null)
            p=n;

        if(p.left()!=null)
        {
            stackNodes.push(p);
            p=p.left();
        }
        else
        {
            while(p.right()==null){
                if(stackNodes.size() > 0)
                p= stackNodes.pop();
                else
                return null;
            }
            p=p.right();
        }

        return p;
    }

    public static void inOrderNonRecursion(BTNode n)
    {
        if(n==null)
            return;
        while(true) {
            while (n != null) {
                stackNodes.push(n);
                n = n.left();
            }
            if(stackNodes.isEmpty())
                break;
            n= stackNodes.pop();
            System.out.println(n.element() + ";");
             n=n.right();
            }
        }

}
