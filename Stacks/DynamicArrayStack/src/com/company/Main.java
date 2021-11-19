package com.company;

public class Main {

    public static void main(String[] args) {
        try {
            IntStack intStack = new IntStack();
            System.out.println(intStack.toString());
            //intStack.pop();
            intStack.push(1);
            intStack.push(2);
            intStack.push(3);
            intStack.push(4);
            intStack.push(5);

            System.out.println(intStack);
            System.out.println(intStack.maxSize);
        } catch (IllegalStateException e) {
            System.out.println(e);
        }
    }
}
