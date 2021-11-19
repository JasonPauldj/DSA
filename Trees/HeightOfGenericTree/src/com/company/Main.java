package com.company;

import jdk.nashorn.internal.runtime.FindProperty;

public class Main {
    static int[] P = {-1,0,1,6,6,0,0,2,7};
    static int cnt=0;
    public static void main(String[] args) {
	int[] P = {-1,0,1,6,6,0,0,2,7};
        System.out.println(findHeightInGenericTree(P));
        System.out.println(cnt);
    }

    public static int findHeightInGenericTree(int [] p){
        int maxDepth = Integer.MIN_VALUE, currentDepth =-1,j;
        for(int i=0; i< p.length; i++){
            currentDepth=0;
            j=i;
            while(P[j]!=-1) {
                currentDepth++;
                j=P[j];
            }

            if(maxDepth < currentDepth)
                maxDepth=currentDepth;
        }
        return maxDepth;
    }

    public static int findHeight(int parent){
        cnt++;
        int height =0;
        for(int i=1; i< P.length;i++){
            if(P[i]==parent){
                height = Math.max(height,findHeight(i)+1);
            }
        }
        return height;
    }
}
