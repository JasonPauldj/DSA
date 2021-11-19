package com.company;

public class Main {

    public static void main(String[] args) {
        MinHeap heap = new MinHeap(0);
        int[] arrayNums ={34,56,12,78,45,20,21};

        for (int i : arrayNums) {
            System.out.print(i +";");
        }
        System.out.println();
        heap.buildHeap(arrayNums);

        for (int i : arrayNums) {
            System.out.print(i +";");
        }
        System.out.println();

        System.out.println(heap.findMaxInMinHeap());

    }
}