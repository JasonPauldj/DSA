package com.company;

public class Block {
    private CList clist;
    private Block next;

    public Block(){
        this.clist = new CList();
    }

    public CList getClist() {
        return clist;
    }

    public Block getNext() {
        return next;
    }

    public void setNext(Block next) {
        this.next = next;
    }
}
