package com.company;

/*REVERSE A STACK USING ONLY STACK OPERATION*/
public class Main {

    public static void main(String[] args) {
        StackList<Integer> stackList = new StackList<Integer>();
        stackList.push(new SListNode<Integer>(4));
        stackList.push(new SListNode<Integer>(3));
        stackList.push(new SListNode<Integer>(2));
        stackList.push(new SListNode<Integer>(1));
        ReverseStack(stackList);
        System.out.println(stackList);
    }

    public static void ReverseStack(StackList<Integer> stack){
        if (stack.IsEmpty())
            return;
        SListNode<Integer> node =stack.pop();
        ReverseStack(stack);
        InsertElementAtBottom(stack,node);
    }

    public static void InsertElementAtBottom(StackList<Integer> stack, SListNode<Integer> node){
        if(stack.IsEmpty())
        {
            stack.push(node);
            return;
        }
        SListNode<Integer> n = stack.pop();
        InsertElementAtBottom(stack,node);
        stack.push(n);
        return;
    }
}
