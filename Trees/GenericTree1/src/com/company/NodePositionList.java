package com.company;

import java.util.Iterator;

public class NodePositionList<E> implements PositionList<E>{
    int numElmts;
    DNode<E> header,trailer;
    public  NodePositionList(){
        numElmts=0;
        this.header = new DNode<E>(null,null,null);
        this.trailer= new DNode<E>(null,null,header);
        this.header.setNext(this.trailer);
    }

    @Override
    public Position<E> first() {
        return header.getNext();
    }

    @Override
    public int size() {
        return numElmts;
    }

    @Override
    public boolean isEmpty() {
        return numElmts==0;
    }

    @Override
    public Position<E> last() {
        return trailer.getPrev();
    }

    @Override
    public Position<E> next(Position<E> p) {
        DNode<E> node = (DNode<E>) p;
        return node.getNext();
    }

    @Override
    public Position<E> prev(Position<E> p) {
        DNode<E> node = (DNode<E>) p;
        return node.getPrev();
    }

    @Override
    public void addFirst(E e) {
        DNode<E> first = header.getNext();
        DNode<E> newNode = new DNode<E>(e,null,null);
        header.setNext(newNode);
        newNode.setPrev(header);
        newNode.setNext(first);
        first.setPrev(newNode);
        numElmts++;
    }

    @Override
    public void addLast(E e) {
        DNode<E> last = trailer.getPrev();
        DNode<E> v = new DNode<E>(e,null,null);
        trailer.setPrev(v);
        v.setNext(trailer);
        v.setPrev(last);
        last.setNext(v);
        numElmts++;
    }

    @Override
    public void addAfter(Position<E> p,E e) {
        DNode<E> z = new DNode<E>(e,null,null);
        DNode next = ((DNode<E>)p).getNext();
        next.setPrev(z);
        z.setPrev(((DNode<E>)p));
        z.setNext(next);
        ((DNode<E>)p).setNext(z);
        numElmts++;
    }

    @Override
    public void addBefore(Position<E> p, E e) {
        DNode<E> z = new DNode<E>(e,null,null);
        DNode<E> prev = ((DNode<E>)p).getPrev();
        prev.setNext(z);
        z.setPrev(prev);
        z.setNext(((DNode<E>)p));
        ((DNode<E>)p).setPrev(z);
        numElmts++;
    }

    @Override
    public E remove(Position<E> p) {
        DNode<E> v = (DNode<E>)p;
        E temp = v.element();
        DNode<E> left = v.getPrev();
        DNode<E> right = v.getNext();

        left.setNext(right);
        right.setPrev(left);

        v.setNext(null);
        v.setPrev(null);

        numElmts--;
        return temp;
    }

    @Override
    public E set(Position<E> p, E e) {
        E temp = p.element();
        DNode<E> v = (DNode<E>)p;
        v.setElement(e);
        return temp;
    }

    @Override
    public Iterable<Position<E>> positions() {
        PositionList<Position<E>> P = new NodePositionList<Position<E>>();
        if(!isEmpty()){
            Position<E> p = first();
            while(true){
                P.addLast(p);
                if(p==last())
                    break;
                p=next(p);
            }
        }
        return P;
    }

    @Override
    public Iterator<E> iterator() {
        return new ElementIterator<E>(this);
    }
}
