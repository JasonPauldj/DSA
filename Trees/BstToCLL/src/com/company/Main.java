package com.company;

public class Main {

    public static void main(String[] args) {
        BST bst = new BST(10);
        bst.insert(3);
        bst.insert(7);
        bst.insert(4);
        bst.insert(19);
        bst.insert(1);
        bst.insert(2);
        bst.insert(15);

        BSTNode headOfCLL = bst.bstToCll(bst.root());
        bst.printCLL(headOfCLL);
    }
}
