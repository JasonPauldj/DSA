package com.company;

public class MinHeap {
    int size;
    int capacity;
    int[] heapArray;

    MinHeap(int cap){
       heapArray = new int[cap];
       this.capacity=cap;
       this.size=0;
    }

    int parentIndex(int childIndex){
        if(childIndex >0 && childIndex < size){
            return (childIndex -1) /2;
        }
        else
            throw new IllegalStateException("cannot find parent Index for this index.");
    }

    int leftChildIndex(int parentIndex){
        if(parentIndex >=0 && parentIndex < size){
            if(2*parentIndex+1 < size)
                return 2*parentIndex+1;
            else
                return -1;
        }
        else
            throw new IllegalStateException("cannot find left child Index for this index.");
    }

    int rightChildIndex(int parentIndex){
        if(parentIndex >=0 && parentIndex < size){
            if(2*parentIndex+2 < size)
                return 2*parentIndex+2;
            else
                return -1;
        }
        else
            throw new IllegalStateException("cannot find right child Index for this index.");
    }

    void insert(int el){
        if(size == capacity){
           resizeHeap();
        }
        heapArray[size]=el;
        int index=size;
        while(index>0 && heapArray[parentIndex(index)] > el){
            heapArray[index]=heapArray[parentIndex(index)];
            index=parentIndex(index);
        }
        heapArray[index]=el;
        size++;
    }

    void resizeHeap(){
        int[] newHeapArray= new int[this.capacity*2];
        System.arraycopy(heapArray, 0, newHeapArray, 0, heapArray.length);
        heapArray=newHeapArray;
        this.capacity=this.capacity*2;
    }

    int getMin(){
        if(size==0)
            throw new IllegalStateException("cannot obtain min from empty heap");
        else
            return heapArray[0];
    }

    int getAndRemoveMin(){
        if(size==0)
            throw new IllegalStateException("cannot obtain and delete min from empty heap");
        else {
            int data= heapArray[0];
            heapArray[0]= heapArray[size-1];
            prelocateDown(0);
            return data;
        }
    }

    void prelocateDown(int index){
        int min=index;
        if(leftChildIndex(index) != -1 && heapArray[index]> heapArray[leftChildIndex(index)] && leftChildIndex(index) < size ){
            min=leftChildIndex(index);
        }
        if(rightChildIndex(index) != -1 && heapArray[min] > heapArray[rightChildIndex(index)] && rightChildIndex(index) < size ){
            min = rightChildIndex(index);
        }

        if(min!=index){
            int temp = heapArray[index];
            heapArray[index] = heapArray[min];
            heapArray[min]=temp;
            prelocateDown(min);
        }
    }

    void buildHeap(int[] arrayNums){
        this.size=arrayNums.length;
        this.capacity=arrayNums.length;

        this.heapArray = arrayNums;

        for(int i=parentIndex(arrayNums.length-1);i>=0;i--){
            prelocateDown(i);
        }
    }

    int findMaxInMinHeap(){
        int indexOfFirstLeafNode = parentIndex(this.size-1);
        int max= Integer.MIN_VALUE;
        for(int i=indexOfFirstLeafNode;i<size;i++){
            if(max < heapArray[i])
                max=heapArray[i];
        }
        return max;
    }
}
