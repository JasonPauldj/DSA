package com.company;

/*Given a BST and two numbers K1 and K2, give an algorithm for printing all the
elements of BST in the range K1 and K2.*/
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

        printRangeValues(2,10,bst.root());

    }

    public static void printRangeValues(int k1, int k2, BSTNode root){
        if(root==null)
            return;

      /*  if(root.element() >=k1){
            printRangeValues(k1,k2,root.left());
        }
        if(root.element()>=k1 && root.element() <=k2)
            System.out.print(root.element() +";");

        if(root.element() <=k2)
            printRangeValues(k1,k2,root.right());*/
        if(root.element()<k1){
            printRangeValues(k1,k2,root.right());
        }
        else if(root.element() >k2)
        {
            printRangeValues(k1,k2,root.left());
        }
        else
        {
            System.out.print(root.element() +";");
           if(root.element()!=k1)
            printRangeValues(k1,k2,root.left());
            if(root.element()!=k2)
            printRangeValues(k1,k2,root.right());
        }
    }
}
