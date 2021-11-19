package com.company;

public class Main {

    public static void main(String[] args) {
	 DList dList = new DList();

	 dList.addLast(new DNode(1,null,null));
	 dList.addLast(new DNode(2,null,null));
	 dList.addLast(new DNode(3,null,null));
	 dList.addLast(new DNode(4,null,null));
	 dList.addLast(new DNode(5,null,null));

	 DNode nodeAtPos= dList.getDNodeAtPos(2);
	 dList.remove(nodeAtPos);

	 System.out.println(dList.toString());

    }
}
