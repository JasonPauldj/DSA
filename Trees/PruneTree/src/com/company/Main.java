package com.company;

public class Main {

    public static void main(String[] args) {
        BST tree = new BST(49);
        tree.insert(37);
        tree.insert(89);
        tree.insert(13);
        tree.insert(41);
        tree.insert(53);
        tree.insert(7);
        tree.insert(19);
        tree.insert(71);
        tree.insert(25);
        tree.insert(60);
        tree.insert(82);

        tree.inOrder(tree.root());
        System.out.println();
        tree.root=pruneTree(tree.root(),90,50);
        System.out.println();
        tree.inOrder(tree.root());
        System.out.println(tree.root().element());
    }

    public static BSTNode pruneTree(BSTNode node, int max, int min){
        if(node==null)
            return node;

        node.replaceLeft(pruneTree(node.left(),max,min));

        if(min <= node.element() && node.element() <= max)
        {
            node.replaceRight(pruneTree(node.right(),max,min));
            return node;
        }
        else if(node.element() < min)
        {
            node.replaceRight(pruneTree(node.right(),max,min));
            return node.right();
        }
        else
            return node.left();
    }
}
