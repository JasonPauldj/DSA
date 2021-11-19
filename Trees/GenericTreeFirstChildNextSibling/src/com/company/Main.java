package com.company;

public class Main {

    public static void main(String[] args) {
	GenericTree<Integer> tree = new GenericTree<>(1);
	tree.root().setFirstChild(2);
    tree.root().getFirstChild().setNextSibling(3);

    }
}
