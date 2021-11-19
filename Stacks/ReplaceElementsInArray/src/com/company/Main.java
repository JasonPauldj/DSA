package com.company;

/*
Given an array of elements, replace every element with nearest greater element
on the right of that element
 */

import java.util.Stack;

public class Main{
    public static void main(String[] args) {
        Stack<Integer> indexStack = new Stack<Integer>();
        int [] integers = {56,16,15,18,27,12,45};
        for(int i=0; i< integers.length;i++){
            if(indexStack.isEmpty())
                indexStack.push(i);
            else{
                while(!indexStack.isEmpty() && integers[indexStack.peek()] < integers[i])
                {
                    integers[indexStack.pop()]=integers[i];
                }
                indexStack.push(i);
            }
        }

        for (int i: integers
             ) {
            System.out.print(i + ";");
        }
    }
}
