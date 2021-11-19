package com.company;

public class Operator {
    char symbol;
    int precedence;
    static int precedenceValue=-1;
    static int noOfOperators = 0;
    static Operator[] operatorsArray = new Operator[20];

    public Operator(char sym,boolean shouldIncrement){
        if(noOfOperators==20){
            throw new IllegalStateException("The permissible number of operators is 20.");
        }
        if(OperatorExistsAlready(sym))
        {
            throw new IllegalStateException("This operator already exists");
        }

        this.symbol = sym;
        if(shouldIncrement)
            precedenceValue++;
        this.precedence=precedenceValue;
        noOfOperators++;
        operatorsArray[noOfOperators-1]=this;
    }

    public char getSymbol() {
        return symbol;
    }

    public int getPrecedence() {
        return precedence;
    }

    public boolean OperatorExistsAlready(char symbol){
        if(noOfOperators > 0) {
            for (int i=0; i< noOfOperators;i++ ) {
                if (operatorsArray[i].getSymbol() == symbol)
                    return true;
            }
        }
        return false;
    }
}
