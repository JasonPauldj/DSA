package com.company;
/*Give an algorithm for printing the level order data in reverse order.*/
public class Main {

    public static void main(String[] args) {
        BTree tree = new BTree(1);
        tree.root().setLeft(2);
        tree.root().setRight(3);
        tree.root().left().setLeft(4);
        tree.root().left().setRight(5);
        tree.root().right().setLeft(6);
        tree.root().right().setRight(7);

        tree.printReverse();
    }
}
