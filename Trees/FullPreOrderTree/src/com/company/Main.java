package com.company;

public class Main {
    static int index=0;
    public static void main(String[] args) {
	char[] preOrder ={'I','I','L','L','I','L','L'};
    BTree tree = new BTree(preOrder[0]);
    processNode(tree.root(),preOrder );
     tree.preOrder(tree.root());
    }

    public static void processNode(BTNode c, char[] preOrder){
            if(c.element()=='I'){
                c.setLeft(preOrder[++index]);
                processNode(c.left(),preOrder);
                c.setRight(preOrder[++index]);
                processNode(c.right(),preOrder);
            }
            else
                return;
        }

}
