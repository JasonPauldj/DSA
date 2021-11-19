package com.company;

public class Main {

    public static void main(String[] args) {
        BTree tree = new BTree(1);
        tree.root().setLeft(2);
        tree.root().setRight(3);
        tree.root().left().setLeft(4);
        tree.root().left().setRight(5);
        tree.root().left().right().setLeft(6);
        tree.root().left().right().setRight(7);


       tree.VerticalSumMain();
        //tree.calculateVertical(tree.root(),5);
       // tree.printVertical();

    }
}
