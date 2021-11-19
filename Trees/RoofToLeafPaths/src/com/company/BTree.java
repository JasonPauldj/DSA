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

    public void rootToLeafPaths(BTNode root, String path) {
        if (root == null)
            return;
        path=path+(root.element()+";");
        rootToLeafPaths(root.left(),path);
        rootToLeafPaths(root.right(),path);

        if(root.left()==null && root.right()==null){
            System.out.println(path);
        }

    }

    public void printPathsRecur(BTNode root, int [] path, int pathlen) {
        if (root == null)
            return;
        path[pathlen]=root.element();
        pathlen++;
        if(root.left()==null && root.right()==null){
            for(int i=0 ;i < pathlen; i++)
            {
                System.out.print(path[i]+";");
            }
            System.out.println();
            return;
        }
        else {
            printPathsRecur(root.left(), path,pathlen);
            printPathsRecur(root.right(), path,pathlen);
        }

    }
}
