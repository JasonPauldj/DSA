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

        printDLL(bstToDLL(bst.root()));

    }

    public static BSTNode bstToDLL(BSTNode root) {
        if (root == null)
            return null;

        BSTNode left = bstToDLL(root.left());
        BSTNode right = bstToDLL(root.right());

        if (left != null)
            insertNodeInDLL(left, root);
        else
            left=root;

        root.replaceRight(right);
        if (right != null)
            right.replaceLeft(root);

        return left;
    }

    public static void insertNodeInDLL(BSTNode head, BSTNode node) {
        while (head.right() != null) {
            head = head.right();
        }
        head.replaceRight(node);
        node.replaceLeft(head);
    }

    public static void printDLL(BSTNode head){
        while(head != null) {
            System.out.print(head.element() + ";");
            head=head.right();
        }
    }
}
