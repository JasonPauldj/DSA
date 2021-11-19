package com.company;

import java.util.Iterator;

public interface Tree <E>{
    public int size();
    public boolean isEmpty();
    public Iterator<E> iterator();
    public Iterable<Position<E>> positions();
    public E replace(Position<E> v, E e) throws InvalidPositionException;
    public TreeNode<E> root() throws EmptyTreeException;
    public Position<E> parent(Position<E> v) throws InvalidPositionException,BoundaryViolationException;
    public Iterable<TreeNode<E>> children(TreeNode<E> v) throws InvalidPositionException;
    public boolean isInternal(TreeNode<E> v) throws InvalidPositionException;
    public boolean isExternal(TreeNode<E> v) throws  InvalidPositionException;
    public boolean isRoot(TreeNode<E> v) throws  InvalidPositionException;
    public void incSize();
    public void decSize();

}
