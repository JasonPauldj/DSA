package com.company;

public class Main {

    public static void main(String[] args) {
        BTree tree = new BTree(1);
        tree.root().setLeft(23);
        tree.root().setRight(333);
        tree.root().left().setLeft(34);
        tree.root().left().setRight(55);

        System.out.println(tree.findElement(35));
    }
}
