package com.company;

public class BTNode {
    private int element;
    private BTNode left;
    private BTNode right;

    public BTNode(int element){
        this.element=element;
        this.left=null;
        this.right=null;
    }
    public int element(){
        return element;
    }
    public BTNode left() {
        return left;
    }

    public BTNode right() {
        return right;
    }

    public void setLeft(int el) {
        BTNode newNode = new BTNode(el);
        this.left = newNode;
    }

    public void setRight(int el) {
        BTNode newNode = new BTNode(el);
        this.right = newNode;
    }
}
