package com.company;

public class Fast_UNION_BySize {
    private int size;
    private int[] parentSizeArray;

    Fast_UNION_BySize(int size) {
        this.size = size;
        this.parentSizeArray = new int[size];
        makeSet();
    }

    private void makeSet() {
        for (int i = 0; i < size; i++) {
            parentSizeArray[i] = -1;
        }
    }

    int Find(int el){
        if(el<0 || el > size)
            return -1;
        else if(parentSizeArray[el] < 0)
            return el;
        else
            return Find(parentSizeArray[el]);
    }

    void Union(int el1, int el2){
        int root1= Find(el1);
        int root2 = Find(el2);
        if(root1==root2)
            return;
        else
        {
            if(parentSizeArray[root1] <= parentSizeArray[root2])
            {
                parentSizeArray[root1] += parentSizeArray[root2];
                parentSizeArray[root2] = root1;
            }
            else
            {
                parentSizeArray[root2] += parentSizeArray[root1];
                parentSizeArray[root1] = root2;
            }
        }
    }

    void printSetsElements(){
        for(int i=0;i<size;i++){
            System.out.println("for element " + i + " the set is " + Find(i) + ";");
        }
    }
}
