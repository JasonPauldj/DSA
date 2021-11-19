package com.company;

import java.util.Scanner;

public class Main {
    //operators added in decreasing precedence order

    static Operator multiplicationOperator = new Operator('*', true);
    static Operator divisonOperator = new Operator('/',false);
    static Operator moduloOperator = new Operator('%',false);

    static Operator addOperator = new Operator('+',true);
    static Operator subOperator = new Operator('-',false);

    static Operator[] operatorsList = Operator.operatorsArray;

    static char[] paranthesisOpenList ={'('};
    public static void main(String[] args) {

        StackList<Character> operatorStack = new StackList<Character>();

        String input;
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLine();

        char[] charArray = input.toCharArray();

        String output="";

        for(int i=0; i < charArray.length ; i++){
            char symbol =charArray[i];

            boolean isParanthesis = IsParenthesis(symbol);

            if(isParanthesis){
                operatorStack.push(new SListNode<>(symbol));
                continue;
            }

            if(IsOperator(symbol)){
               int pVCurrentChar= GetPrecedenceVal(symbol);
               int pVStackTopChar= !operatorStack.IsEmpty() && IsOperator(operatorStack.getTop().getElement()) ?
                       GetPrecedenceVal(operatorStack.getTop().getElement()) : Integer.MAX_VALUE ;
               while(pVStackTopChar <= pVCurrentChar){
                   output+=operatorStack.pop().getElement();
                   pVStackTopChar= operatorStack.IsEmpty() || IsParenthesis(operatorStack.getTop().getElement()) ?
                           Integer.MAX_VALUE :
                                   GetPrecedenceVal(operatorStack.getTop().getElement());
               }
                operatorStack.push(new SListNode<Character>(symbol));
                System.out.println(operatorStack.toString());
            }
            else if(symbol==')'){
                while(!operatorStack.IsEmpty() && operatorStack.getTop().getElement() != '(')
                output+= operatorStack.pop().getElement();
                operatorStack.pop();
            }
            else
            {
                output+=symbol;
            }
        }

        while(operatorStack.getSize() > 0){
            output+= operatorStack.pop().getElement();
        }
        System.out.println(output);

    }

    public static boolean IsOperator(char symbol){
        for(int j=0; j < Operator.noOfOperators; j++) {
            if (operatorsList[j].getSymbol() == symbol) {
                return true;
            }
        }
        return false;
    }

    public static boolean IsParenthesis(char symbol){
        for(int j=0; j < paranthesisOpenList.length; j++) {
            if (paranthesisOpenList[j] == symbol) {
                return true;
            }
        }
        return false;
    }

    public static int GetPrecedenceVal(char symbol) {
        for(int j=0; j < Operator.noOfOperators; j++) {
            if (operatorsList[j].getSymbol() == symbol) {
                return operatorsList[j].getPrecedence();
            }
        }
        return -1;
    }

}
