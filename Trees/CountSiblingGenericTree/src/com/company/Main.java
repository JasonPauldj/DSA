package com.company;

public class Main {

    public static void main(String[] args) {
        GenericTree<Integer> tree = new GenericTree<>(1);
        tree.root().setFirstChild(2);
        tree.root().getFirstChild().setNextSibling(3);
        tree.root().getFirstChild().getNextSibling().setNextSibling(4);
        tree.root().getFirstChild().getNextSibling().getNextSibling().setFirstChild(5);
        tree.root().getFirstChild().getNextSibling().getNextSibling().setNextSibling(6);

        System.out.println(tree.countSiblingsOfNode(tree.root(), tree.root().getFirstChild().getNextSibling()));
    }
}
