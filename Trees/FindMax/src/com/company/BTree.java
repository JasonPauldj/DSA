package com.company;

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

    public int getMax() {
        // return  findMaxRecursion(this.root);
       // return findMaxNonRecursion();
        return findMaxRecursionPreOrder(this.root);
    }

    private int findMaxRecursion(BTNode node) {

        if (node == null)
            return Integer.MIN_VALUE;

        int max;
        int left = findMaxRecursion(node.left());
        int right = findMaxRecursion(node.right());

        if (left > right)
            max = left;
        else if (right > node.element())
            max = right;
        else
            max = node.element();

        return max;
    }

    private int findMaxRecursionPreOrder(BTNode node) {

        if (node == null)
            return Integer.MIN_VALUE;

        int max = node.element();
        max = Math.max(max, findMaxRecursion(node.left()));
        max =Math.max(max,findMaxRecursion(node.right()));

        return max;
    }

    private int findMaxNonRecursion() {
        Stack<BTNode> elements = new Stack<>();
        BTNode root = this.root;
        int max = Integer.MIN_VALUE;
        BTNode previous = null;

        do{
            while (root != null) {
                elements.push(root);
                root = root.left();
            }
            while(root==null && !elements.isEmpty())
            {
                root=elements.peek();
                if(root.right()==null || root.right()==previous)
                {
                    if (root.element() > max)
                        max = root.element();
                    elements.pop();
                    previous=root;
                    root=null;
                }
                else
                {
                    root=root.right();
                }
            }
        }while(!elements.isEmpty());
        return max;
    }
}
