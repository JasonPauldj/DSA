package com.company;

public class Main {

    public static void main(String[] args) {
        BTree tree = new BTree(1);
        tree.root().setLeft(2);
        tree.root().setRight(3);
        tree.root().left().setLeft(4);
        tree.root().left().left().setLeft(5);
        tree.root().right().setRight(6);
        tree.root().right().right().setLeft(7);
        tree.root().right().right().left().setRight(8);

        BTree tree1 = new BTree(1);
        tree1.root().setLeft(2);
        tree1.root().left().setRight(3);
        tree1.root().setRight(3);
       // tree1.root().left().setRight(4);
      //  tree1.root().left().right().setLeft(5);
        tree1.root().right().setLeft(6);
        tree1.root().right().left().setLeft(7);
        tree1.root().right().left().left().setRight(8);

        System.out.println(areQuasiIsomorphic(tree.root(),tree1.root()));

    }

    public static boolean areQuasiIsomorphic(BTNode n1, BTNode n2)
    {
        if(n1!=null && n2==null)
            return false;

        if(n1==null && n2!=null)
            return false;

        if(n1==null && n2==null)
            return true;

        return ((areQuasiIsomorphic(n1.left(),n2.left()) && areQuasiIsomorphic(n1.right(),n2.right())) ||
                (areQuasiIsomorphic(n1.left(),n2.right()) && areQuasiIsomorphic(n1.right(),n2.left())));

    }
}
