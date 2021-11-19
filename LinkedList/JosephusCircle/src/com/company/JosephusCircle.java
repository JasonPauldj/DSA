package com.company;

public class JosephusCircle {
    int sizeOfCircle;
    int stepsPerElimnation;
    CListNode head;
    public JosephusCircle(int n, int m){
        this.sizeOfCircle=n;
        this.stepsPerElimnation=m;

        this.head= new CListNode(1);
        CListNode current = this.head;
        for(int i=2; i<=n;i++){
            current.setNext(new CListNode(i));
            current=current.getNext();
            current.setNext(this.head);
        }
    }

    public CListNode executeElimination(){
        CListNode ptr1 = this.head;
        CListNode ptr2= this.head;

        while(ptr1.getNext()!=ptr1){
            int cnt=1;
            while(cnt!=stepsPerElimnation){
                ptr2=ptr1;
                ptr1= ptr1.getNext();
                cnt++;
            }
            ptr2.setNext(ptr1.getNext());
            ptr1=ptr1.getNext();
        }
        return ptr1;
    }
}
