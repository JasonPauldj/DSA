package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Fast_UNION_ByHeight unionFind = new Fast_UNION_ByHeight(20);
        long start = System.nanoTime();
        unionFind.Union(1,15);
        unionFind.Union(1,8);
        unionFind.Union(2,6);
        unionFind.Union(2,17);
        unionFind.Union(1,2);
        unionFind.Union(7,19);
        unionFind.Union(5,10);
        long end = System.nanoTime() - start;
        unionFind.printSetsElements();
        System.out.println();
        System.out.println(end);

    }

}
