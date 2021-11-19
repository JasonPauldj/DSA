package com.company;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        try {
            IntStack intStack = new IntStack();
            System.out.println(intStack.toString());

            intStack.push(1);
            intStack.push(2);
            intStack.push(3);

            System.out.println(intStack);
            System.out.println(intStack.pop());
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

    }
}
