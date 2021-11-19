package com.company;

/*Given a sorted array, give an algorithm for converting the array to BST.*/
public class Main {

    public static void main(String[] args) {
	int [] arr = {1,2,3,4,5,6,7,8,9,10};
	BST tree = new BST();
	tree.setRoot(tree.sortedArrayToBST(arr,0,arr.length-1));
	tree.inOrder(tree.root());
	tree.preOrder(tree.root());
    }
}
