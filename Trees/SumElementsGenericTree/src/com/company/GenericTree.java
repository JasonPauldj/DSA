package com.company;

public class GenericTree <E>{
    GenericTreeNode<E> root;

    public GenericTree(){
        this.root=null;
    }

    public GenericTree(E el)
    {
        this.root = new GenericTreeNode<>(el);
    }

    public GenericTreeNode<E> root(){
        return this.root;
    }

    public int sumElements(GenericTreeNode<E> node){
        if(node==null)
            return 0;

        return (Integer)node.getElement() + sumElements(node.getFirstChild()) + sumElements(node.getNextSibling());
    }
}
