package com.company;

public class Main {

    public static void main(String[] args) {
        BTree<Integer> tree = new BTree<>(1);
        tree.root().setLeft(2);
        tree.root().left().setLeft(3);
        tree.root().left().left().setLeft(4);
        tree.root().left().left().left().setRight(5);

        System.out.println(tree.heightOfTree());


       /* tree.preOrder(tree.root());
        System.out.println();
        tree.inOrder(tree.root());
        System.out.println();
        tree.postOrder(tree.root());
        System.out.println();
        tree.levelOrder(tree.root());*/
    }

    
}
