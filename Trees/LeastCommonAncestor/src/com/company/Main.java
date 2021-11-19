package com.company;
/*Give an algorithm for finding LCA (Least Common Ancestor) of two nodes in a
Binary Tree.*/
public class Main {

    public static void main(String[] args) {
        BTree tree = new BTree(1);
        tree.root().setLeft(6000);
        tree.root().setRight(333);
        tree.root().left().setLeft(34);
        tree.root().left().setRight(55);
        tree.root().right().setLeft(380);
        tree.root().right().setRight(20);
        tree.root().right().right().setRight(10);

        System.out.println(tree.leastCommonAncestor(tree.root(), tree.root().left(),
                tree.root().left().left()).element());
    }
}
