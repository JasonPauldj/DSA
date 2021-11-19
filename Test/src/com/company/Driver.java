package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Driver {

    public static void main(String[] args) {
        

    }
    
    public static int MinTaps(int n, int[] ranges){
        int minNoTaps = 0;
        int [] tapsOpen = new int[n];
        List<Integer> listOfTaps = new ArrayList<Integer>();
        listOfTaps.add(0);
        int len=0;
        for(int i=1; i<=n;i++){
            len++;
            int lastTapPos = listOfTaps.get(listOfTaps.size()-1);
            int secondLastTapPos = listOfTaps.size()>=2 ? listOfTaps.get(listOfTaps.size()-2) : -1;

            while(secondLastTapPos !=-1 &&  i-ranges[i] <= secondLastTapPos + ranges[secondLastTapPos]){
                listOfTaps.set(listOfTaps.size()-1,i);
            }


        }


        return (list.size()==0) ? -1 : list.size();
    }
}

