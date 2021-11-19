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

    public void findMaxSumLevel(){
        int maxSum =0;
        int sumAtLevel=0;
        int level=0;
        int maxLevel=0;
         if(root==null)
         {
             System.out.println("Empty tree");
             return;
         }
         else
         {
             Queue<BTNode> nodes = new Queue<>();
             nodes.enqueue(root);
             nodes.enqueue(null);
             try {
                 while (!nodes.isEmpty()) {
                     BTNode temp = nodes.dequeue();
                     if(temp==null){
                         if(maxSum<sumAtLevel)
                         {
                             maxSum=sumAtLevel;
                             maxLevel=level;
                         }
                         if(!nodes.isEmpty())
                         {
                             level++;
                             sumAtLevel=0;
                             nodes.enqueue(null);
                         }
                         continue;
                     }
                     sumAtLevel+=temp.element();
                     if(temp.left()!=null)
                     {
                         nodes.enqueue(temp.left());
                     }
                     if(temp.right()!=null)
                     {
                         nodes.enqueue(temp.right());
                     }
                 }
                 System.out.println("the max sum is " + maxSum + " and at level " + maxLevel);
             }
             catch (InterruptedException e){
                 System.out.println(e);
             }
         }
    }
}
