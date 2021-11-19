package com.company;

/*Given a binary tree, print out all its root-to-leaf path*/

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

        tree.rootToLeafPaths(tree.root(),"");
        //tree.printPathsRecur(tree.root(), new int[10],0);
    }
}
