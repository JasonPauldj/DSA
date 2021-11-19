package com.company;

public class Main {

    public static void main(String[] args) {
	    BTree tree = new BTree(1);
	    tree.root().setLeft(2);
	    tree.root().setRight(3);
	    tree.root().left().setLeft(4);
	    tree.root().left().setRight(5);

	    tree.preOrder();

    }
}
