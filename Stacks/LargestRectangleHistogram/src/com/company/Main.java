package com.company;

import java.util.Stack;

/*assume that the rectangles have equal widths but may have different height.
* given an array with heights of rectangles (assuming width is 1), we need to find the largest rectangle possible.*/


public class Main {

    public static void main(String[] args) {
        int[] hist = {1,5,7,6,1};
        int maxArea = -1;
        Stack<Integer> indexStack = new Stack<Integer>();

        for (int i = 0; i < hist.length; ) {
            if (indexStack.isEmpty() || hist[indexStack.peek()] < hist[i]) {
                indexStack.push(i);
                i++;
            } else {
                int indexOfRect = indexStack.pop();
                int cnt = i - indexOfRect;
                cnt += !indexStack.isEmpty() ? indexOfRect - indexStack.peek() : 1;
                cnt--;
                int area = cnt * hist[indexOfRect];
                if (area > maxArea) {
                    maxArea = area;
                    System.out.println("max area being calculated for the index" + indexOfRect + " and max area is " + maxArea);
                }
            }
        }

        while (!indexStack.isEmpty()) {
            int indexOfRect = indexStack.pop();
            int cnt = indexStack.isEmpty() ? 1 : indexOfRect - indexStack.peek();
            int area = cnt * hist[indexOfRect];
            if (area > maxArea) {
                maxArea = area;
                System.out.println("WHILE max area being calculated for the index" + indexOfRect + " and max area is " + maxArea);
            }
        }

        System.out.println(maxArea);
    }
}