package com.company;

public class CList {
    private int size;
    private CListNode cursor;

    public CList(){
        this.size =0;
    }

    public int size(){
        return size;
    }

    public void advance(){
        cursor=cursor.getNext();
    }

    public void add(CListNode v){
        if(size==0){
            cursor=v;
            v.setNext(v);
        }
        else {
            CListNode rightOfCursor = cursor.getNext();
            cursor.setNext(v);
            v.setNext(rightOfCursor);
        }
        size++;
    }

    public CListNode getCursor() {
        return cursor;
    }

    public CListNode remove() throws IllegalStateException{
        if(size >0 ) {
            size--;
            if (cursor.getNext() != cursor) {
                CListNode newNextToCursor = cursor.getNext().getNext();
                CListNode nextToCursor = cursor.getNext();
                nextToCursor.setNext(null);
                cursor.setNext(newNextToCursor);
                return nextToCursor;
            } else {
                CListNode returnNode = cursor;
                cursor = null;
                return returnNode;
            }
        }
        else
            throw new IllegalStateException("there are not items in the circular list to remove");
    }

    public String toString (){
        String s="[";
        CListNode current = cursor;
        for(int i=1; i<=size ;i++){
            s+= current.getElement();
            s+=";";
            current=current.getNext();
        }
        s+="]";
        return s;
    }
}