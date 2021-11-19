package com.company;

public class Fast_FIND_Implementation {
    private int size;
    private int[] setArray;

    Fast_FIND_Implementation(int size) {
        this.size = size;
        this.setArray = new int[size];
        makeSet();
    }

    private void makeSet() {
        for (int i = 0; i < size; i++) {
            setArray[i] = i;
        }
    }

    int Find(int el) {
        return setArray[el];
    }

    void Union(int el1, int el2) {
        if (Find(el1) == Find(el2))
            return;
        else {
            for (int i = 0; i < size; i++) {
                if (setArray[i] == Find(el2))
                    setArray[i] = el1;
            }
        }
    }

    void printSetsElements(){
        for(int i=0;i<size;i++){
            System.out.println("for element " + i + " the set is " + setArray[i] + ";");
        }
    }

}
