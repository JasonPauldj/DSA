package com.company;

public class BSTNode {
    private int el;
    private BSTNode left;
    private BSTNode right;
    private BSTNode parent;
    private int height;

    BSTNode(int element){
        this.el=element;
        left=null;
        right=null;
        parent=null;
        height=0;
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

    void incHeight(){
        this.height++;
    }

    int getHeight(){
        return  this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
