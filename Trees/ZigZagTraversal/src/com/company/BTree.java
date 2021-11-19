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

   public boolean printAncestors(BTNode root, BTNode n)
   {
       if(root==null)
           return false;

       if(root==n) {
           System.out.print(root.element()+";");
          // path[ind]= root.element();
           return true;
       }
      // path[ind]= root.element();
      // ind++;
       boolean pathExist = printAncestors(root.left(),n) || printAncestors(root.right(),n);
        if(pathExist)
            System.out.print(root.element()+";");
       return pathExist;

   }
}
