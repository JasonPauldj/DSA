package com.company;

public class Main {

    public static void main(String[] args) {
        SList sList1 = new SList();
        // ADD NODES TO THE SINGLY LINKED LIST
        sList1.addNode(new SListNode(1));
        sList1.addNode(new SListNode(2));
        sList1.addNode(new SListNode(3));
        sList1.addNode(new SListNode(4));
        sList1.addNode(new SListNode(5));

        SList sList2 = new SList();
        // ADD NODES TO THE SINGLY LINKED LIST
        sList2.addNode(new SListNode(7));
        sList2.addNode(new SListNode(8));
        sList2.addNode(new SListNode(9));

        //merging the 2 lists
        int mergePosRelativetoList1 = 3;
        sList2.addNode(sList1.getNode(3));
        /*changing the size - remember previous addNode() adds 1 to the size.
        Need to increment size for the remaining nodes in List1
         */
        sList2.setSize(sList2.getSize() + sList1.getSize() - mergePosRelativetoList1);

        SListNode pointer1 = sList1.getHead();
        SListNode pointer2 = sList2.getHead();

        if (sList1.getSize() >= sList2.getSize()) {
            int diff = sList1.getSize() - sList2.getSize();
            while (diff != 0) {
                pointer1 = pointer1.getNext();
                diff--;
            }
        } else {
            int diff = sList2.getSize() - sList1.getSize();
            while (diff != 0) {
                pointer2 = pointer2.getNext();
                diff--;
            }
        }

        SListNode mergeNode = null;

        while (pointer1 != pointer2) {
            pointer1 = pointer1.getNext();
            pointer2 = pointer2.getNext();
        }

        if (pointer1 != null)
            mergeNode = pointer1;
        if (mergeNode != null)
            System.out.println("The merged node has a value of " + mergeNode.getElement());
        else
            System.out.println("the 2 lists do not merge");
    }

}
