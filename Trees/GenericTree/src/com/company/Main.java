package com.company;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        try {
            GenericTree<Integer> genTree = new GenericTree<Integer>(1);
            genTree.root().addChild(2);
            genTree.root().addChild(3);
            Iterator<TreeNode<Integer>> iterator = genTree.root().children.iterator();
            while (iterator.hasNext()) {
                TreeNode<Integer> node = iterator.next();
                System.out.println(node.element());
                node.addChild(400);
            }
            for (int x: genTree) {
                System.out.println(x);
            }
        }
        catch (EmptyTreeException e)
        {
            System.out.println(e);
        }
    }
}
