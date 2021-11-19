package com.company;

import sun.misc.Queue;

public class BTree<E> {
    BTNode<E> root;

    public BTree() {
        this.root = null;
    }

    public BTree(E el) {
        root = new BTNode<E>(el);
    }

    public BTNode<E> root() {
        if (root == null)
            throw new IllegalStateException("The tree is empty");
        return root;
    }

    public void preOrder(BTNode<E> root) {
        if (root == null)
            return;
        System.out.print(root.element() + ";");
        preOrder(root.left());
        preOrder(root.right());
    }

    public void inOrder(BTNode<E> root) {
        if (root == null)
            return;
        inOrder(root.left());
        System.out.print(root.element() + ";");
        inOrder(root.right());
    }

    public void postOrder(BTNode<E> root) {
        if (root == null)
            return;
        postOrder(root.left());
        postOrder(root.right());
        System.out.print(root.element() + ";");
    }

    public void levelOrder(BTNode<E> root) {
        Queue<BTNode<E>> q = new Queue();

        if (root == null)
            return;

        q.enqueue(root());
        try {
            while (!q.isEmpty()) {
                BTNode<E> temp = q.dequeue();
                System.out.print(temp.element() +";");
                if(temp.left()!= null)
                    q.enqueue(temp.left());
                if(temp.right() != null)
                    q.enqueue(temp.right());
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public int heightOfTree(){
        return findHeight(this.root);
    }

    public int findHeight(BTNode<E> root)
    {
        if(root==null)
        {
            return -1;
        }
        int height=1+Math.max(findHeight(root.left()),findHeight(root.right()));
        return height;
    }
}

