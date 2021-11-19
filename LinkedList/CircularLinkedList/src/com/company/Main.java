package com.company;

public class Main {

    public static void main(String[] args) {
	    CList cList = new CList();

	    cList.add(new CListNode(1));
	    cList.add(new CListNode(2));
        cList.add(new CListNode(3));
        System.out.println(cList.toString());
        CListNode remNode = cList.remove();

        System.out.println(remNode.getElement());

        System.out.println(cList.toString());
    }
}
