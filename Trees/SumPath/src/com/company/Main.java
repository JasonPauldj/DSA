package com.company;

/*Give an algorithm for checking the existence of path with given sum. That
 means, given a sum, check whether there exists a path from root to any of the nodes.*/
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

        System.out.println(tree.sumPath(tree.root(), 0,335));
    }
}
