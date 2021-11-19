package com.company;

public class Main {
    static int maxSumPath = Integer.MIN_VALUE;
    private BST tree;

    public static void main(String[] args) {
	 BST tree = new BST(4);
	 tree.insert(2);
	 tree.insert(5);
	 tree.insert(1);
	 tree.insert(3);
	 tree.insert(6);
	 tree.insert(7);

	 findMaxSumPath(tree.root());

        System.out.println(treeTraversal(tree.root()));
    }

    public static int findMaxSumPath(BSTNode node){
        if(node==null)
            return 0;

        int leftSum = findMaxSumPath(node.left());
        int rightSum = findMaxSumPath(node.right());

        int sumPath = Math.max(leftSum + node.element(), rightSum + node.element());

        if(node.element() > maxSumPath)
            maxSumPath = node.element();

        if(leftSum+rightSum + node.element() > maxSumPath){
            maxSumPath = leftSum+rightSum + node.element();
        }
        if(sumPath > maxSumPath)
            maxSumPath=sumPath;

        return sumPath;
    }

    public static int treeTraversal(BSTNode root)
    {
        if(root==null)
            return 1;

        int a= treeTraversal(root.left());
        int b = treeTraversal(root.right());
        return a+b;
    }
}
