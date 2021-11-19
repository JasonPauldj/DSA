package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CList cList = new CList();
        Scanner scanner = new Scanner(System.in);

        cList.add(new CListNode(1));
        cList.add(new CListNode(2));
        cList.add(new CListNode(3));
        cList.add(new CListNode(4));
        cList.add(new CListNode(5));
        cList.add(new CListNode(6));

        CListNode itNode = cList.remove();
        System.out.println("Player " + itNode.getElement() + " is It");
        System.out.println("");
        boolean continueGame =true;

        while(continueGame) {
            boolean isDuck = HeadOrTail();
            while (isDuck) {
                cList.advance();
                System.out.println("Player " + cList.getCursor().getElement() + " is Duck");
                isDuck = HeadOrTail();
            }
            System.out.println("");
            System.out.println("Player " + cList.getCursor().getNext().getElement() + " is Goose");
            CListNode gooseNode = cList.remove();

            boolean ifItWon = HeadOrTail();
            if (ifItWon) {
                cList.add(itNode);
                itNode = gooseNode;
                System.out.println("Player IT Won");
                System.out.println("Player " + itNode.getElement() + " is It");
                System.out.println();
            } else {
                System.out.println("Player GOOSE Won");
                cList.add(gooseNode);
            }

            System.out.println(cList.toString());

            System.out.println("Do you want to continue playing");
            continueGame =scanner.nextBoolean();
        }

    }

    public static boolean HeadOrTail (){
        Random random = new Random();
        return random.nextInt() % 2==0;
    }
}
