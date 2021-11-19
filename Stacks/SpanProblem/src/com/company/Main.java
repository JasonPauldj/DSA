package com.company;

import java.time.Duration;
import java.time.Instant;

/*Given an array A, the span S[i] of A[i] is the maximum number
of consecutive elements A[j] immediately preceding A[i] and such that A[j] < A[i]?*/
public class Main {

    public static void main(String[] args) {
	    int[] array = {6,3,4,5,2,3,5,2,6,7,4,5,6,8,3,2,4,5,7,9,4,5,6,7,8};
	    int[] spanarray = new int[array.length];
        long start = System.nanoTime();
	     //BruteForceSolution(array,spanarray);
        ImprovedSolution(array,spanarray);
	    long end = System.nanoTime();
	    long  timeelapsed = end-start;
        System.out.println(timeelapsed);
        for (int x: spanarray
             ) {
            System.out.print(x+";");
        }
    }

    public static void BruteForceSolution(int [] arr, int [] span){
        for(int i=0;i<arr.length;i++){
            int cnt=1;
            for(int j=1 ; j<=i; j++){
                if(arr[i-j]<=arr[i])
                    cnt++;
                else
                    break;
            }
            span[i]=cnt;
        }
    }

    public static void ImprovedSolution(int[] arr, int []span){
        span[0]=1;
        for(int i=1;i<arr.length;i++){
            int j=i-1;
            int cnt=1;
            while(j>= 0 && arr[j]<= arr[i]){
                cnt+=span[j];
                j-=span[j];
            }
            span[i]=cnt;
        }
    }
}
