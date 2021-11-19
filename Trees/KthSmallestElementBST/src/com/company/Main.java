package com.company;
/*Give an algorithm for finding the kth smallest element in BST.*/
public class Main {
    static int cnt =0;
    public static void main(String[] args) {
        BST bst = new BST(10);
        bst.insert(3);
        bst.insert(7);
        bst.insert(4);
        bst.insert(19);
        bst.insert(1);
        bst.insert(2);
        bst.insert(15);
        //traverse(bst.root(),0);
        kthSmallestElement(bst.root(),5);
    }

    public static void kthSmallestElement(BSTNode root, int k){
        if(root ==null)
            return;
        kthSmallestElement(root.left(),k);
        cnt++;
        if(cnt==k) {
            System.out.println(root.element());
            return;
        }
        kthSmallestElement(root.right(),k);
    }

}
