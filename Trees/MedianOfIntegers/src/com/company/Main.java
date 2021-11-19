package com.company;

public class Main {

    public static void main(String[] args) {
        BST tree = new BST(8);
        System.out.println(median(tree.root(), (tree.root().nLeft + tree.root().nRight + 2) / 2,
                (tree.root().nLeft + tree.root().nRight + 1)  % 2 != 0));
        tree.insert(6);
        System.out.println(median(tree.root(), (tree.root().nLeft + tree.root().nRight + 2) / 2,
                (tree.root().nLeft + tree.root().nRight + 1)  % 2 != 0));
        tree.insert(15);
        System.out.println(median(tree.root(), (tree.root().nLeft + tree.root().nRight + 2) / 2,
                (tree.root().nLeft + tree.root().nRight + 1)  % 2 != 0));
        tree.insert(1);
        System.out.println(median(tree.root(), (tree.root().nLeft + tree.root().nRight + 2) / 2,
                (tree.root().nLeft + tree.root().nRight + 1)  % 2 != 0));
        tree.insert(5);
        System.out.println(median(tree.root(), (tree.root().nLeft + tree.root().nRight + 2) / 2,
                (tree.root().nLeft + tree.root().nRight + 1)  % 2 != 0));
        tree.insert(-3);
        System.out.println(median(tree.root(), (tree.root().nLeft + tree.root().nRight + 2) / 2,
                (tree.root().nLeft + tree.root().nRight + 1)  % 2 != 0));

    }

    public static float median(BSTNode root, int pos, boolean isOdd){
        if(pos==root.nLeft+1){
            if(isOdd)
                return root.element();
            else
                return (float)(root.element() + findSuccessor(root).element())/2;
        }
        if(pos <= root.nLeft)
            return median(root.left(),pos, isOdd);
        else
            return median(root.right(),pos - root.nLeft -1, isOdd);
    }

    public static BSTNode findSuccessor(BSTNode node){
        BSTNode successor;

        if(node.right() != null){
            successor=node.right();
            while(successor.left()!=null)
            {
                successor=successor.left();
            }
            return successor;
        }

        else {
            successor = node.parent();
            while (successor!=null && successor.element() < node.element()) {
                successor = successor.parent();
            }
            return successor;
        }
    }
}
