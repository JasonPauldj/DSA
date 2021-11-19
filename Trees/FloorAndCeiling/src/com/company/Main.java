package com.company;

/*Floor and ceiling: If a given key is less than the key at the root of a BST then the
floor of the key (the largest key in the BST less than or equal to the key) must be in the left
subtree. If the key is greater than the key at the root, then the floor of the key could be in the
right subtree, but only if there is a key smaller than or equal to the key in the right subtree;
if not (or if the key is equal to the the key at the root) then the key at the root is the floor of
the key. Finding the ceiling is similar, with interchanging right and left. For example, if the
sorted with input array is {1, 2, 8, 10, 10, 12, 19}, then
For x = 0: floor doesn’t exist in array, ceil = 1, For x = 1: floor = 1, ceil = 1
For x = 5: floor =2, ceil = 8, For x = 20: floor = 19, ceil doesn’t exist in array*/

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

        System.out.println(bst.ceiling(5,bst.root()).element());
    }
}
