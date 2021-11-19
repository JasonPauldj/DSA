package com.company;

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

    public BTNode leastCommonAncestor(BTNode root, BTNode n1, BTNode n2)
    {
       if(root==n1)
           return n1;

       if(root==n2)
           return n2;

       if(root==null)
           return null;

       BTNode left = leastCommonAncestor(root.left(),n1,n2);
       BTNode right = leastCommonAncestor(root.right(),n1,n2);

       if(left!=null && right != null)
           return root;
       else if(left!=null)
       {
           return left;
       }
       else return right;
    }
}
