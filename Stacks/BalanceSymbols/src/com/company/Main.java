package com.company;

import java.util.Scanner;

/******** BALANCING OF SYMBOLS *******/
public class Main {

    public static void main(String[] args) {
	    String input;
        Stack<Character> stack = new Stack<Character>();
        boolean validInput = true;
        Scanner scanner= new Scanner(System.in);
        input = scanner.nextLine();

        char[] charArray = input.toCharArray();

        for(int i=0; i < charArray.length && validInput; i++){
            if(charArray[i]=='(' || charArray[i]=='[' || charArray[i]=='{')
            {
                stack.push(new Node<Character>(charArray[i]));
            }
            else if(charArray[i]==')' || charArray[i]==']' || charArray[i]=='}')
            {
                switch (charArray[i]) {
                    case ')' :
                        if(stack.pop().getElement()!= '(')
                            validInput = false;
                            break;
                    case ']' :
                        if(stack.pop().getElement()!= '[')
                            validInput = false;
                        break;
                    case '}' :
                        if(stack.pop().getElement()!= '{')
                            validInput=false;
                        break;
                }

            }
        }
        if(validInput && stack.IsEmpty())
            System.out.println("Input is valid");
        else
            System.out.println("Input is invalid");
    }
}
