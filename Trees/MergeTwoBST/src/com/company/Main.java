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

        BST bst1 = new BST(4);
        bst1.insert(5);
        bst1.insert(8);
        bst1.insert(1);
        bst1.insert(15);
        bst1.insert(20);

        mergeBST(bst.root(),bst1.root());
    }

    static BSTNode findMinUtil(BSTNode root) {

        BSTNode currNode = root;
        if (currNode == null) {
            throw new IllegalStateException("there is no tree to find min");
        }
        while (currNode.left() != null) {
            currNode = currNode.left();
        }
        return currNode;
    }

    static BSTNode findNextMin(BSTNode node) {
        if(node.right()!=null)
        {
            return findMinUtil(node.right());
        }
        BSTNode currNode = node.parent();
        while(currNode!=null && currNode.element()< node.element())
        {
            currNode = currNode.parent();
        }
        return currNode;
    }

    public static void mergeBST(BSTNode root1, BSTNode root2) {
        BSTNode min1 = findMinUtil(root1);
        BSTNode min2 = findMinUtil(root2);

        while (!(min1 == null && min2 == null)) {

            if (min1 == null) {
                System.out.print(min2.element() + ";");
                min2 = findNextMin(min2);
            } else if (min2 == null) {
                System.out.print(min1.element() + ";");
                min1 = findNextMin(min1);
            } else if (min1.element() == min2.element()) {
                System.out.print(min1.element() + ";");
                min1 = findNextMin(min1);
                min2 = findNextMin(min2);
            } else if (min1.element() < min2.element()) {
                System.out.print(min1.element() + ";");
                min1 = findNextMin(min1);
            } else {
                System.out.print(min2.element() + ";");
                min2 = findNextMin(min2);
            }
        }
    }
}
