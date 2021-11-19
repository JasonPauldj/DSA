package com.company;

/*Given two trees, give an algorithm for checking whether they are mirrors of
each other.*/
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
        tree1.root().setRight(6000);
        tree1.root().setLeft(333);
        tree1.root().right().setRight(34);
        tree1.root().right().setLeft(55);
        tree1.root().left().setRight(380);
        tree1.root().left().setLeft(1);
        tree1.root().left().left().setLeft(10);


        System.out.println(tree.checkMirror(tree.root(),tree1.root()));
    }
}
