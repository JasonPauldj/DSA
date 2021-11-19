package com.company;

public class Main {
    static int num=0;
    public static void main(String[] args) {
	BST tree = new BST();
	tree.root = buildAVLTree(4);
	tree.preOrder(tree.root());
	System.out.println();
	tree.postOrder(tree.root());
    }

    public static BSTNode buildAVLTree(int height){
        if(height < 0)
            return null;
        BSTNode node = new BSTNode(0);
        node.replaceLeft(buildAVLTree(height-1));
        node.setElement(++num);
        node.replaceRight(buildAVLTree(height-2));
        return node;
    }
}
