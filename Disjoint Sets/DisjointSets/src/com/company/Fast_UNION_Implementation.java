package com.company;

public class Fast_UNION_Implementation {
    private int size;
    private int[] parentArray;

    Fast_UNION_Implementation(int size) {
        this.size = size;
        this.parentArray = new int[size];
        makeSet();
    }

    private void makeSet() {
        for (int i = 0; i < size; i++) {
            parentArray[i] = i;
        }
    }

    int Find(int el){
        if(el<0 || el > size)
            return -1;
        else if(parentArray[el]==el)
            return el;
        else
            return Find(parentArray[el]);
    }

    void Union(int el1, int el2){
        int root1= Find(el1);
        int root2 = Find(el2);
        if(root1==root2)
            return;
        else
        {
            parentArray[root1]=root2;
        }
    }

    void printSetsElements(){
        for(int i=0;i<size;i++){
            System.out.println("for element " + i + " the set is " + Find(i) + ";");
        }
    }
}
