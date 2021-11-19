package com.company;

public class Main {

    public static void main(String[] args) {
        BTree tree = new BTree(1);
        tree.root().setLeft(6000);
        tree.root().setRight(333);
        tree.root().left().setLeft(34);
        tree.root().left().setRight(55);
        tree.root().right().setLeft(380);
        tree.root().right().setRight(1);
        tree.root().right().right().setRight(10);

        BTree tree1 = new BTree(1);
        tree1.root().setLeft(6000);
        tree1.root().setRight(333);
        tree1.root().left().setLeft(34);
        tree1.root().left().setRight(55);
        tree1.root().right().setLeft(380);
        tree1.root().right().setRight(1);
        tree1.root().right().right().setRight(10);

        System.out.println(areIsomorphicTrees(tree.root(),tree1.root()));
    }

    public static boolean areIsomorphicTrees(BTNode n1, BTNode n2)
    {
        if(n1!=null && n2==null)
            return false;

        if(n1==null && n2!=null)
            return false;

        if(n1==null && n2==null)
            return true;

        return areIsomorphicTrees(n1.left(),n2.left()) && areIsomorphicTrees(n1.right(),n2.right());
    }
}
