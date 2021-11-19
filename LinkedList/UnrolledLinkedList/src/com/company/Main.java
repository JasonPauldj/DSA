package com.company;

public class Main {

    public static void main(String[] args) {
        UnrolledLL unrolledLL = new UnrolledLL(13);

        unrolledLL.addNode(new CListNode(1));
        unrolledLL.addNode(new CListNode(2));
        unrolledLL.addNode(new CListNode(3));
        unrolledLL.addNode(new CListNode(4));
        unrolledLL.addNode(new CListNode(5));
        unrolledLL.addNode(new CListNode(6));
        unrolledLL.addNode(new CListNode(7));
        unrolledLL.addNode(new CListNode(8));
        unrolledLL.addNode(new CListNode(9));
        unrolledLL.addNode(new CListNode(10));
        unrolledLL.addNode(new CListNode(11));

        System.out.println(unrolledLL.getNode(3).getElement());

        System.out.println(unrolledLL.toString());

    }
}
