package com.company;

public class Fast_UNION_ByHeight {
    private int size;
    private int[] parentHeightArray;

    Fast_UNION_ByHeight(int size) {
        this.size = size;
        this.parentHeightArray = new int[size];
        makeSet();
    }

    private void makeSet() {
        for (int i = 0; i < size; i++) {
            parentHeightArray[i] = -1;
        }
    }

    int Find(int el){
        if(el<0 || el > size)
            return -1;
        else if(parentHeightArray[el] < 0)
            return el;
        else
            return Find(parentHeightArray[el]);
    }

    void Union(int el1, int el2){
        int root1= Find(el1);
        int root2 = Find(el2);
        if(root1==root2)
            return;
        else
        {
            if(parentHeightArray[root1] < parentHeightArray[root2])
            {
                parentHeightArray[root2] = root1;
            }
            else if(parentHeightArray[root1] == parentHeightArray[root2])
            {
                parentHeightArray[root2] = root1;
                parentHeightArray[root1]= --parentHeightArray[root1];
            }
            else{
                parentHeightArray[root1] = root2;
            }
        }
    }

    void printSetsElements(){
        for(int i=0;i<size;i++){
            if(parentHeightArray[i] < 0)
                System.out.println("element " + i + " is a root having a height " + parentHeightArray[i]);
            else
                System.out.println("for element " + i + " the set is " + Find(i) + ";");
        }
    }
}
