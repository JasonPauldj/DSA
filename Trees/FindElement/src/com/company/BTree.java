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

    public boolean findElement(int el) {
        // return  findMaxRecursion(this.root);
        return searchElement(el, this.root);
    }

    private boolean searchElement(int el, BTNode root)
    {
        if(root==null)
            return false;
        if(root.element()==el)
            return true;
        else
        {
            boolean isElementExist = searchElement(el, root.left());
            if(!isElementExist) {
                isElementExist = searchElement(el, root.right());
                return isElementExist;
            }
            else
                return true;
        }
    }
}
