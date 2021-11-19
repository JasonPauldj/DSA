package com.company;

public class Main {
    static int smallestClosestValue = Integer.MIN_VALUE;
    static int greatestClosestValue = Integer.MAX_VALUE;
    public static void main(String[] args) {
	    BST tree = new BST(56);
	    tree.insert(32);
	    tree.insert(25);
	    tree.insert(45);
	    tree.insert(50);
	    tree.insert(72);
	    tree.insert(64);
	    tree.insert(70);
	    tree.insert(90);
	    tree.insert(80);

	    int key=95;
	    closestKey(tree.root(), key);

        System.out.println((key - smallestClosestValue) < (greatestClosestValue - key) ? smallestClosestValue :
                greatestClosestValue);
    }

    public static void closestKey(BSTNode node ,int key){
        if(node==null)
            return;

        if(node.element() < key) {
            smallestClosestValue = node.element();
            closestKey(node.right(),key);
        }
        else if(node.element() > key){
            greatestClosestValue = node.element();
            closestKey(node.left(),key);
        }
        else
        {
            smallestClosestValue=node.element();
            return;
        }
    }
}
