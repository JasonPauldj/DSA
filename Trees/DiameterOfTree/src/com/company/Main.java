package com.company;

/*Give an algorithm for finding the diameter of the binary tree. The diameter of a
tree (sometimes called the width) is the number of nodes on the longest path between two
leaves in the tree*/

public class Main {

    public static void main(String[] args) {
        BTree tree = new BTree(1);
        tree.root().setLeft(1);
        tree.root().setRight(1);
        tree.root().left().setLeft(1);
        tree.root().left().setRight(1);
        tree.root().left().left().setLeft(1);
        tree.root().left().left().setRight(1);
        tree.root().left().left().right().setLeft(1);
        tree.root().left().left().right().left().setRight(1);
        tree.root().left().right().setRight(1);
        tree.root().left().right().right().setLeft(1);
        tree.root().left().right().right().setRight(1);
        tree.root().left().right().right().right().setLeft(1);

        System.out.println(tree.diameter(tree.root()));
    }
}
