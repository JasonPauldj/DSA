package com.company;

public class UnrolledLL {
    private Block head;
    private  int size;
    private  int maxSize;

    public UnrolledLL(int maxSize){
        this.maxSize = maxSize;
        this.head=new Block();
        this.size =0;
    }

    public int getSize() {
        return size;
    }

    public void addNode(CListNode newNode){
        Block current = head;

            while (current.getNext() != null) {
                current = current.getNext();
            }
            if (current.getClist().size() < Math.ceil(Math.sqrt(maxSize))) {
                current.getClist().add(newNode);
            } else {
                Block newBlock = new Block();
                current.setNext(newBlock);
                newBlock.getClist().add(newNode);
            }
            size++;
    }

    public CListNode getNode(int pos) throws IllegalArgumentException{
        if(size ==0 ){
            throw new IllegalArgumentException("The list is empty");
        }
        if(pos < 0 || pos >=size ){
            throw new IllegalArgumentException("The position is invalid for the given list");
        }

        int blockPos = (int)Math.floor(pos/Math.ceil(Math.sqrt(maxSize)));
        int iter =0;
        Block current = head;
        while(iter < blockPos){
            current=current.getNext();
            iter++;
        }

        int nodePos = (int)(pos % Math.ceil(Math.sqrt(maxSize)));

        iter=0;
        CListNode currentNode = current.getClist().getCursor();
        while(iter < nodePos){
            currentNode = currentNode.getNext();
            iter++;
        }

        return currentNode;
    }

    public String toString(){
        String s ="";
        Block currentBlock = head;
        int blockNo =0;
        while(currentBlock != null ){
            s+="[";
            s= s + "in block no " + blockNo + " ";
            CListNode currentCListNode = currentBlock.getClist().getCursor();
            while(currentCListNode != null & currentCListNode.getNext() != currentBlock.getClist().getCursor()){
                s+= currentCListNode.getElement();
                s+=";";
                currentCListNode = currentCListNode.getNext();
            }
            s+=currentCListNode.getElement();
            s+="]";
            s+="\n";

            blockNo++;
            currentBlock = currentBlock.getNext();
        }
        return s;
    }

}
