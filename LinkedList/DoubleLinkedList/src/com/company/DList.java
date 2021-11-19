package com.company;

public class DList {
    private int size=0;
    DNode header, trailer;

    public DList(){
        this.header = new DNode(0,null,null);
        this.trailer= new DNode(0,null,null);
        this.header.setNext(this.trailer);
        this.trailer.setPrev(this.header);
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return (size ==0);
    }

    public DNode getFirst() throws IllegalStateException{
        if(isEmpty())
            throw new IllegalStateException("List is Empty");
        else
            return this.header.getNext();
    }

    public DNode getLast() throws IllegalStateException {
        if(isEmpty())
            throw new IllegalStateException("List is Empty");
        else
            return this.trailer.getPrev();
    }

    public DNode getPrev(DNode v) throws IllegalArgumentException{
    if(v==header)
        throw new IllegalArgumentException("Cannot get previous of header");
    else
        return v.getPrev();
    }

    public DNode getNext(DNode v) throws IllegalArgumentException {
        if(v==trailer)
            throw new IllegalArgumentException("Cannot go further than the trailer");
        else
            return v.getNext();
    }

    public void addBefore(DNode v, DNode z) throws IllegalArgumentException {
            DNode prev = v.getPrev();
            prev.setNext(z);
            z.setPrev(prev);
            z.setNext(v);
            v.setPrev(z);
            size++;
    }

    public void addAfter(DNode v, DNode z) throws IllegalArgumentException {
        DNode next = v.getNext();
        next.setPrev(z);
        z.setPrev(v);
        z.setNext(next);
        v.setNext(z);
        size++;
    }

    public void addFirst(DNode v) throws IllegalStateException {
        DNode first = header.getNext();
        header.setNext(v);
        v.setPrev(header);
        v.setNext(first);
        first.setPrev(v);
        size++;
    }

    public void addLast(DNode v) throws IllegalStateException {
        DNode last = trailer.getPrev();
        trailer.setPrev(v);
        v.setNext(trailer);
        v.setPrev(last);
        last.setNext(v);
        size++;
    }

    public void remove(DNode v) throws IllegalStateException {
        DNode left = v.getPrev();
        DNode right = v.getNext();

        left.setNext(right);
        right.setPrev(left);

        v.setNext(null);
        v.setPrev(null);

        size--;
    }

    public boolean hasPrev(DNode v){
       return v!=header;
    }

    public boolean hasNext(DNode v){
        return v!=trailer;
    }

    public DNode getDNodeAtPos(int pos) throws IllegalArgumentException{
        if(pos <=0  || pos > size){
            throw new IllegalArgumentException("The requested position in not valid.");
        }
        else
        {
            DNode current = header;
            while(pos!=0){
                current=current.getNext();
                pos--;
            }
            return current;
        }
    }

    public String toString(){
        String s ="[";
        for(int i=1; i<= size;i++){
            s += getDNodeAtPos(i).getElement();
            s+=";";
        }
        s+="]";

        return s;
    }

}
