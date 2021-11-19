package com.company;

public class Dequeue<E> {
    private int size=0;
    DNode<E> header, trailer;

    public Dequeue(){
        this.header = new DNode<E>(null,null,null);
        this.trailer= new DNode<E>(null,null,null);
        this.header.setNext(this.trailer);
        this.trailer.setPrev(this.header);
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return (size ==0);
    }

    public DNode<E> getFirst() throws IllegalStateException{
        if(isEmpty())
            throw new IllegalStateException("List is Empty");
        else
            return this.header.getNext();
    }

    public DNode<E> getLast() throws IllegalStateException {
        if(isEmpty())
            throw new IllegalStateException("List is Empty");
        else
            return this.trailer.getPrev();
    }

    public DNode<E> getPrev(DNode<E> v) throws IllegalArgumentException{
        if(v==header)
            throw new IllegalArgumentException("Cannot get previous of header");
        else
            return v.getPrev();
    }

    public DNode<E> getNext(DNode<E> v) throws IllegalArgumentException {
        if(v==trailer)
            throw new IllegalArgumentException("Cannot go further than the trailer");
        else
            return v.getNext();
    }

    public void addFirst(E v) throws IllegalStateException {
        DNode<E> newNode = new DNode<E>(v,null,null);
        DNode<E> first = header.getNext();
        header.setNext(newNode);
        newNode.setPrev(header);
        newNode.setNext(first);
        first.setPrev(newNode);
        size++;
    }

    public void addLast(E v) throws IllegalStateException {
        DNode<E> newNode = new DNode<E>(v,null,null);
        DNode<E> last = trailer.getPrev();
        trailer.setPrev(newNode);
        newNode.setNext(trailer);
        newNode.setPrev(last);
        last.setNext(newNode);
        size++;
    }

    public void removeFirst(){
        if(isEmpty())
            throw new IllegalStateException("the dequeue is empty");
        DNode<E> first = header.getNext();
        header.setNext(first.getNext());
        first.getNext().setPrev(header);
        first.setPrev(null);
        first.setNext(null);
        size--;
    }

    public void removeLast(){
        if(isEmpty())
            throw new IllegalStateException("the dequeue is empty");
        DNode<E> last = trailer.getPrev();
        trailer.setPrev(last.getPrev());
        last.getPrev().setNext(trailer);
        last.setPrev(null);
        last.setNext(null);
        size--;
    }

    public void remove(DNode<E> v) throws IllegalStateException {
        DNode<E> left = v.getPrev();
        DNode<E> right = v.getNext();

        left.setNext(right);
        right.setPrev(left);

        v.setNext(null);
        v.setPrev(null);

        size--;
    }

    public boolean hasPrev(DNode<E> v){
        return v!=header;
    }

    public boolean hasNext(DNode<E> v){
        return v!=trailer;
    }

    public DNode<E> getDNodeAtPos(int pos) throws IllegalArgumentException{
        if(pos <=0  || pos > size){
            throw new IllegalArgumentException("The requested position in not valid.");
        }
        else
        {
            DNode<E> current = header;
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
