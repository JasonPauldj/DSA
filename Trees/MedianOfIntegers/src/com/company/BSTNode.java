package com.company;

public class BSTNode {
    private int el;
    private BSTNode left;
    private BSTNode right;
    private BSTNode parent;
    private int size;
    int nLeft;
    int nRight;

    BSTNode(int element){
        this.el=element;
        left=null;
        right=null;
        parent=null;
        size=1;
        nLeft=0;
        nRight=0;
    }

    int element(){
        return this.el;
    }

    BSTNode left(){
        return this.left;
    }

    BSTNode right(){
        return this.right;
    }

    BSTNode parent(){
        return this.parent;
    }

    void replaceLeft(BSTNode node){
        this.left=node;
    }

    void replaceRight(BSTNode node){
        this.right=node;
    }

    void setRight( int element){
        this.right = new BSTNode(element);
        this.right.parent=this;
    }

    void setLeft( int element){
        this.left = new BSTNode(element);
        this.left.parent = this;
    }

    void setElement(int element){
        this.el = element;
    }

    void incSize(){
        this.size++;
    }

    public int getSize() {
        return size;
    }
}
