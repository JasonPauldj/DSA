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

    public int countSiblingsOfNode(GenericTreeNode<E> processNode,GenericTreeNode<E> node){
        int cnt=0;
        if(processNode==null)
            return 0;
        if(processNode==node){
            node=node.getNextSibling();
            while(node!=null) {
                cnt++;
                node=node.getNextSibling();
            }
            return cnt;
        }

       cnt =countSiblingsOfNode(processNode.getFirstChild(),node);
        if(cnt==0){
            cnt=countSiblingsOfNode(processNode.getNextSibling(),node);
            if(cnt>0)
                cnt++;
        }
        return cnt;
    }
}
