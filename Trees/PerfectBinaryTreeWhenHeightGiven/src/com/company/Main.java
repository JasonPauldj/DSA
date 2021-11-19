package com.company;

public class Main {

    public static void main(String[] args) {
        BST tree= new BST();
        tree.root = buildBinaryTree(1,3);

        tree.preOrder(tree.root());
    }

    public static BSTNode buildBinaryTree(int start, int height){
        if(height < 0)
            return null;

        int noOfNodes =(int) Math.pow(2,height+1) -1;
        int last = start + noOfNodes -1;
        int mid = (last - start + 1)/2 + start;

        BSTNode node = new BSTNode(mid);

        node.replaceLeft(buildBinaryTree(start,height-1));
        node.replaceRight(buildBinaryTree(mid+1,height-1));
        return node;
    }
}
