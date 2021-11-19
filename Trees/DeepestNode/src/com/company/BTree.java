package com.company;

import sun.misc.Queue;

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

    public void findDeepestNode(){
        if(this.root==null)
            return;
        int level=0;
        Queue<BTNode> nodesQueue = new Queue<>();
        nodesQueue.enqueue(this.root);
        nodesQueue.enqueue(null);
        BTNode temp;
        BTNode finalNode=null;
        try {
            while (!nodesQueue.isEmpty()) {
                temp=nodesQueue.dequeue();
                if(temp==null)
                {
                    level++;
                    if(!nodesQueue.isEmpty())
                    nodesQueue.enqueue(null);
                    continue;
                }
                if(temp.left()!=null)
                    nodesQueue.enqueue(temp.left());
                if(temp.right()!=null)
                    nodesQueue.enqueue(temp.right());
                if(temp.left()==null && temp.right()==null)
                {
                    finalNode=temp;
                }
            }
            System.out.println("the final node is at the level " + --level + "having a value " + finalNode.element() );
        }
        catch(InterruptedException e)
        {

        }
    }


}
