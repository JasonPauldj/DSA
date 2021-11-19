package com.company;

import java.util.Iterator;

public class GenericTree<E> implements Tree<E>, Iterable<E>{
    int noOfNodes;
    PositionList<E> nodeElements;
    TreeNode<E> root;

    public GenericTree(E rtEl){
    noOfNodes=0;
    nodeElements = new NodePositionList<E>();
    this.root=new TreeNode<>(rtEl,this,null);
    }

    public void incSize(){
        noOfNodes++;
    }

    public void decSize(){
        noOfNodes--;
    }

    @Override
    public int size() {
        return noOfNodes;
    }

    @Override
    public boolean isEmpty() {
        return noOfNodes==0;
    }

    @Override
    public Iterator<E> iterator() {

        try {
            preOrder(this, root());
            return new ElementIterator<E>(nodeElements);
        }
        catch(EmptyTreeException e)
        {
            System.out.println(e);
        }
        return null;
    }

    @Override
    public Iterable<Position<E>> positions() {
        return null;
    }

    @Override
    public E replace(Position<E> v, E e) throws InvalidPositionException {
        return null;
    }

    @Override
    public TreeNode<E> root() throws EmptyTreeException {
        return root;
    }

    @Override
    public Position<E> parent(Position<E> v) throws InvalidPositionException, BoundaryViolationException {
        return null;
    }

    @Override
    public Iterable<TreeNode<E>> children(TreeNode<E> v) throws InvalidPositionException {
        Iterable<TreeNode<E>> childrenOfNodes = v.children;
        return childrenOfNodes;
    }

    @Override
    public boolean isInternal(TreeNode<E> v) throws InvalidPositionException {
        return v.children.size()>0;
    }

    @Override
    public boolean isExternal(TreeNode<E> v) throws InvalidPositionException {
        return v.children.size()==0;
    }

    @Override
    public boolean isRoot(TreeNode<E> v) throws InvalidPositionException {
        return v.parent==null;
    }

    public void preOrder(Tree<E> T, TreeNode<E> n){
      nodeElements.addLast(n.element());
      try
        {
            if (T.isExternal(n))
                return;
            for (TreeNode<E> child : children(n)) {
                preOrder(T, child);
            }
        }
      catch (InvalidPositionException e)
      {
          System.out.println(e);
      }

    }
}
