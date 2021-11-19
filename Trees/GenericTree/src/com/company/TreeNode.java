package com.company;

public class TreeNode<E> implements  Position<E>{
    E element;
    TreeNode<E> parent;
    PositionList<TreeNode<E>> children;
    Tree<E> tree;

    TreeNode(E el, Tree<E> T,TreeNode<E> parent){
        this.element=el;
        this.children= new NodePositionList<TreeNode<E>>();
        this.parent=parent;
        this.tree=T;
    }

    @Override
    public E element() {
        return element;
    }

    public void addChild(E el){
        children.addLast(new TreeNode<E>(el,tree,this));
        tree.incSize();
    }
}
