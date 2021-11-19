package com.company;

public class BTree {
    BTNode root;

    public BTree() {
        this.root = null;
    }

    public BTree(char el) {
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

    public boolean checkMirror(BTNode root, BTNode root1)
    {
        if(root==null && root1==null)
            return true;

        if(root==null)
            return false;

        if(root1== null)
            return false;

        if(root.element()==root1.element())
        {
            return checkMirror(root.left(),root1.right()) && checkMirror(root.right(), root1.left());
        }
        else
            return false;
    }
}
