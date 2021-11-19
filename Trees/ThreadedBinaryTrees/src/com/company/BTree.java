package com.company;

import java.util.Stack;

public class BTree {
   private BTNode root;
    BTNode dummy;

    public BTree() {
        this.root = null;
        this.dummy= new BTNode(0);
        this.dummy.isLeftThreaded=false;
        this.dummy.isRightThreaded=false;
        this.dummy.replaceRight(this.dummy);
        this.dummy.replaceLeft(this.root);
    }

    public BTree(int el) {
        this.dummy= new BTNode(0);
        this.dummy.isLeftThreaded=false;
        this.dummy.isRightThreaded=false;
        this.dummy.replaceRight(this.dummy);
        root = new BTNode(el);
        this.dummy.replaceLeft(this.root);
        this.root.replaceLeft(this.dummy);
        this.root.replaceRight(this.dummy);
    }

    public BTNode root() {
        if (root == null)
            throw new IllegalStateException("The tree is empty");
        return root;
    }


    public BTNode inOrderSuccessor(BTNode n){
        if(n.isRightThreaded){
            return n.right();
        }
        else{
            BTNode position = n.right();
            while(!position.isLeftThreaded){
                position=position.left();
            }
            return  position;
        }
    }
    public void inOrderTraversal(){
        BTNode node = this.dummy;
        while(true){
            node=inOrderSuccessor(node);
            if(node==this.dummy)
                break;
            System.out.println(node.element() +";");
        }
    }

    public BTNode preOrderSuccessor(BTNode n){
        if(!n.isLeftThreaded){
            return n.left();
        }
        else{
            BTNode position = n;
            while(position.isRightThreaded){
                position=position.right();
            }
            return  position.right();
        }
    }

    public void preOrder() {
        BTNode node = this.dummy;
        while(true){
            node=preOrderSuccessor(node);
            if(node==this.dummy)
                break;
            System.out.println(node.element() +";");
        }
    }

    public void postOrder(BTNode root) {
        if (root == null)
            return;
        postOrder(root.left());
        postOrder(root.right());
        System.out.print(root.element() + ";");
    }


}
