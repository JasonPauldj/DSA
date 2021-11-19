package com.company;

public class Main {
    static int postfixLen;

    static Operator multiplicationOperator = new Operator('*', true);
    static Operator divisonOperator = new Operator('/',false);
    static Operator moduloOperator = new Operator('%',false);

    static Operator addOperator = new Operator('+',true);
    static Operator subOperator = new Operator('-',false);

    static Operator[] operatorsList = Operator.operatorsArray;


    public static void main(String[] args) {
	char[] postfix ={'E','F','+','A','B','+','C','*','+','D','+'};
	postfixLen = postfix.length-1;
	BTree tree = new BTree();
	tree.root=buildBinaryExpressionTree(postfix);

	tree.inOrder(tree.root());
    }

    public static BTNode buildBinaryExpressionTree(char[] postfix){
        BTNode node = (postfixLen >=0 ) ? new BTNode(postfix[postfixLen]) : null;

        if(postfixLen >=0 && IsOperator(postfix[postfixLen]))
        {
            postfixLen--;
            node.replaceLeft(buildBinaryExpressionTree(postfix));
            postfixLen--;
            node.replaceRight(buildBinaryExpressionTree(postfix));
            return node;
        }
        else
        {
            return node;
        }
    }

    public static boolean IsOperator(char symbol){
        for(int j=0; j < Operator.noOfOperators; j++) {
            if (operatorsList[j].getSymbol() == symbol) {
                return true;
            }
        }
        return false;
    }
}
