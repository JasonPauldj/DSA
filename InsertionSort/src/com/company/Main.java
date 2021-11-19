package com.company;

public class Main {

    public static void main(String[] args) {
	int [] array = {54,34,67,22,45};
	for(int i=1; i<= array.length-1;i++){
	    int current = array[i];
	    for(int j=i-1; j>=0;j--){
	        if(array[j]>current){
	            int temp = array[j];
	            array[j] = current;
	            array[j+1]=temp;
            }
	        else
	            break;
        }
    }
        for (int i: array) {
            System.out.println(i);
        }
    }
}
