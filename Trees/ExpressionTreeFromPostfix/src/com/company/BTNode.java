package com.company;

public class BTNode {
    private char element;
    private BTNode left;
    private BTNode right;

    public BTNode(char element){
        this.element=element;
        this.left=null;
        this.right=null;
    }
    public char element(){
        return element;
    }
    public BTNode left() {
        return left;
    }

    public BTNode right() {
        return right;
    }

    public void replaceLeft(BTNode node)
    {
        this.left=node;
    }

    public void replaceRight(BTNode node)
    {
        this.right=node;
    }

    public void setLeft(char el) {
        BTNode newNode = new BTNode(el);
        this.left = newNode;
    }

    public void setRight(char el) {
        BTNode newNode = new BTNode(el);
        this.right = newNode;
    }
}
