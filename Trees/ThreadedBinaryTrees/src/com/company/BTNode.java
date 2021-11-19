package com.company;

public class BTNode {
    private int element;
    private BTNode left;
    private BTNode right;
    public boolean isLeftThreaded;
    public boolean isRightThreaded;

    public int getElement() {
        return element;
    }

    public BTNode(int element){
        this.element=element;
        this.left=null;
        this.right=null;
        this.isLeftThreaded=true;
        this.isRightThreaded=true;
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

    public void replaceLeft(BTNode node)
    {
        this.left=node;
    }

    public void replaceRight(BTNode node)
    {
        this.right=node;
    }

    public void setLeft(int el) {
        BTNode newNode = new BTNode(el);
        newNode.replaceLeft(this.left());
        this.left = newNode;
        newNode.isLeftThreaded=this.isLeftThreaded;
        this.isLeftThreaded=false;
        newNode.replaceRight(this);
        newNode.isRightThreaded=true;

        if(!newNode.isLeftThreaded){
            BTNode currNode = newNode.left();
            while(!currNode.isRightThreaded){
                currNode=currNode.right();
            }
            currNode.replaceRight(newNode);
        }

        //newNode.left().replaceRight(newNode);

    }

    public void setRight(int el) {
        BTNode newNode = new BTNode(el);
        newNode.replaceRight(this.right());
        this.right = newNode;
        newNode.isRightThreaded=this.isRightThreaded;
        this.isRightThreaded=false;
        newNode.replaceLeft(this);
        newNode.isLeftThreaded=true;

        if(!newNode.isRightThreaded){
            BTNode currNode = newNode.right();
            while(!currNode.isLeftThreaded){
                currNode=currNode.left();
            }
            currNode.replaceLeft(newNode);
        }
       // newNode.right().replaceLeft(newNode);

    }
}
