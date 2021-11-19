package com.company;

public class Main {
    static int cnt=0;
    public static void main(String[] args) {
        BST bst = new BST(10);
        bst.insert(3);
        bst.insert(7);
        bst.insert(4);
        bst.insert(19);
        bst.insert(1);
        bst.insert(2);
        bst.insert(15);

        System.out.println( greaterThanConstant(0,bst.root()));
    }

    public static int greaterThanConstant(int k, BSTNode root){
        if(root==null)
            return 0;
       int cnt=0;
        if(root.element()>k) {
            cnt +=(root.right()!= null)? root.right().getSize() +1 : 1;
            cnt+=greaterThanConstant(k,root.left());
        }
        else if(root.element()==k)
            cnt+=(root.right()!= null)? root.right().getSize()  : 0;
        else
          cnt+= greaterThanConstant(k, root.right());

        return cnt;
    }
}
