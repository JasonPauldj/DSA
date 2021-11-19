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

    public int findHeight(BTNode root)
    {
        if(root==null)
        {
            return 0;
        }
        int height=1+Math.max(findHeight(root.left()),findHeight(root.right()));
        return height;
    }

    public int diameter(BTNode node )
    {
        if(node==null)
            return 0;

        int lheight = findHeight(node.left());
        int rheight = findHeight(node.right());

        int ldiameter = diameter(node.left());
        int rdiameter = diameter(node.right());

        return Math.max(1+lheight+rheight,Math.max(ldiameter,rdiameter));

    }


}
