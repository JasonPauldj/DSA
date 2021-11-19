package com.company;

import java.util.Scanner;

/*Given a string of characters,recursively remove adjacent duplicate characters from string. The output string should not
have any adjacent duplicates*/

public class Main {

    public static void main(String[] args) {
        String input ="";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter string");
        input = scanner.next();
        char[] inputchars = input.toCharArray();
        recursiveDeleteDuplicate(inputchars);
        for (char c: inputchars
             ) {
            if(c=='\0')
                break;
            System.out.print(c +";");
        }
    }
    public static void recursiveDeleteDuplicate(char[] chars){
        int stackpointer=-1;
        int i=0;

        while(i < chars.length){
            if(stackpointer==-1||chars[stackpointer]!=chars[i]){
                stackpointer++;
                chars[stackpointer]=chars[i];
                i++;
            }
            else
            {
                while(i < chars.length && chars[stackpointer]==chars[i]){
                    i++;
                }
                stackpointer--;
            }
        }
        chars[stackpointer+1]='\0';
    }
}
