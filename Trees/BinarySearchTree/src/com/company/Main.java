package com.company;

public class Main {

    public static void main(String[] args) {
        try {
            BST bst1 = new BST();
            System.out.println(bst1.findMin());
        }
        catch (IllegalStateException e) {
            System.out.println(e);
        }
        BST bst = new BST(10);
        bst.insert(3);
        bst.insert(7);
        bst.insert(4);
        bst.insert(19);
        bst.insert(1);
        bst.insert(2);
        bst.insert(15);

       // bst.delete(bst.root(),4);

       // bst.inOrder(bst.root());
        System.out.println(bst.LCA(7,4).element());

    }
}
