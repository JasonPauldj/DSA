package com.company;

/*Give an algorithm for converting a tree to its mirror. Mirror of a tree is another
tree with left and right children of all non-leaf nodes interchanged*/
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

        tree.preOrder(tree.root());

        System.out.println();

        tree.MirrorTree(tree.root());

        tree.preOrder(tree.root());

    }
}
