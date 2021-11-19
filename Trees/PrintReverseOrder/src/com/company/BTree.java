package com.company;

import sun.misc.Queue;

import java.util.Stack;

public class BTree {
    BTNode root;

    public BTree() {
        this.root = null;
    }

    public BTree(int el) {
        root = new BTNode(el);
    }

    public BTNode root() {
        if (root == null)
            throw new IllegalStateException("The tree is empty");
        return root;
    }

    public void preOrder(BTNode root) {
        if (root == null)
            return;
        System.out.print(root.element() + ";");
        preOrder(root.left());
        preOrder(root.right());
    }

    public void inOrder(BTNode root) {
        if (root == null)
            return;
        inOrder(root.left());
        System.out.print(root.element() + ";");
        inOrder(root.right());
    }

    public void postOrder(BTNode root) {
        if (root == null)
            return;
        postOrder(root.left());
        postOrder(root.right());
        System.out.print(root.element() + ";");
    }

    public void printReverse(){
        BTNode root = this.root;
        Queue<BTNode> queueNodes = new Queue<>();
        Stack<BTNode> stackNodes = new Stack<>();
        queueNodes.enqueue(root);
        try {
            while (!queueNodes.isEmpty()) {
                BTNode temp = queueNodes.dequeue();
                stackNodes.push(temp);

                if(temp.right()!= null)
                    queueNodes.enqueue(temp.right());
                if(temp.left()!=null)
                    queueNodes.enqueue(temp.left());
            }
            while(!stackNodes.isEmpty()){
                System.out.print(stackNodes.pop().element()+";");
            }
        }
        catch(InterruptedException e)
        {

        }
    }
}
