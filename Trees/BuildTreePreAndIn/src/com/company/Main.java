package com.company;

import java.awt.*;
import java.util.LinkedList;

public class Main {
    static BTree tree;

    static int indPreOrder = 0;

    public static void main(String[] args) {
        int[] preOrder = {1, 2, 4, 5, 6, 7, 3};
        int[] inOrder = {4, 2, 6, 5, 7, 1, 3};

        BTree tree = new BTree();
        tree.root = BuildTree(inOrder, preOrder, 0, inOrder.length-1);

        tree.preOrder(tree.root);

    }

    static BTNode BuildTree(int[] inOrder, int[] preOrder, int inOrderStart, int inOrderEnd) {

     /*  if (inOrderStart > inOrderEnd)
            return null;*/

        BTNode newNode = new BTNode(preOrder[indPreOrder]);
        indPreOrder++;

        if (inOrderStart == inOrderEnd)
            return newNode;

        int inOrderIndex = 0;

        for (int i = inOrderStart; i <= inOrderEnd; i++) {
            if (inOrder[i] == newNode.element()) {
                inOrderIndex = i;
                break;
            }
        }

        BTNode left = BuildTree(inOrder, preOrder, inOrderStart, inOrderIndex - 1);
        newNode.replaceLeft(left);
        BTNode right = BuildTree(inOrder, preOrder, inOrderIndex+1, inOrderEnd);
        newNode.replaceRight(right);

        return newNode;
    }
}

