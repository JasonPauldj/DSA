package com.company;

public class Main {

    public static void main(String[] args) {
        BST bst = new BST(5);
        bst.insert(1);
        bst.insert(7);
        bst.insert(3);
        bst.inOrder(bst.root());
        System.out.println();
        bst.preOrder(bst.root());
        bst.insert(2);
        System.out.println();
        System.out.println();
        bst.inOrder(bst.root());
        bst.preOrder(bst.root());
    }
}
