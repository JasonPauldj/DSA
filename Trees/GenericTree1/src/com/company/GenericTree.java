package com.company;

import javafx.geometry.Pos;

import java.util.Iterator;

public class GenericTree<E> implements Tree<E>, Iterable<E>{
    int noOfNodes;
    PositionList<E> nodeElements;
    TreeNode<E> root;

    public GenericTree(E rtEl){
    noOfNodes=1;
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
    public Iterable<Position<E>>children(Position<E> v) throws InvalidPositionException {
        TreeNode<E> node = (TreeNode<E>)v;
        PositionList<Position<E>> P = new NodePositionList<Position<E>>();
        if(node.children.size()>0){
            Iterator<Position<E>> iterator = node.children.iterator();
            while(iterator.hasNext())
            {
                Position<E> child= iterator.next();
                P.addLast(child);
            }
        }
        return P;
    }

    @Override
    public boolean isInternal(Position<E> v) throws InvalidPositionException {
        TreeNode<E> node = (TreeNode<E>)v;
        return node.children.size()>0;
    }

    @Override
    public boolean isExternal(Position<E> v) throws InvalidPositionException {
        TreeNode<E> node = (TreeNode<E>)v;
        return node.children.size()==0;
    }

    @Override
    public boolean isRoot(Position<E> v) throws InvalidPositionException {
        TreeNode<E> node = (TreeNode<E>)v;
        return node.parent==null;
    }

    public void preOrder(Tree<E> T, TreeNode<E> n){
      nodeElements.addLast(n.element());
      try
        {
            if (T.isExternal(n))
                return;
            Iterable<Position<E>> children = children(n);

            for (Position<E> child : children(n)) {
                preOrder(T, (TreeNode<E>) child);
            }
        }
      catch (InvalidPositionException e)
      {
          System.out.println(e);
      }

    }
}
