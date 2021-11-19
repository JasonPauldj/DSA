package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Please enter values for List 1");
        char response = 'Y';
        SList list1 = new SList();
        Scanner scanner = new Scanner(System.in);
        while(response == 'Y'){
            int val = scanner.nextInt();
            list1.addNode(new SListNode(val));

            System.out.println("Do you want to continue add to list 1? Enter Y for Yes else Enter N for No");
            response = scanner.next().charAt(0);
            while(response != 'Y' && response != 'N'){
                System.out.println("Please enter a valid entry");
                System.out.println("Do you want to continue add to list 1? Enter Y for Yes else Enter N for No");
                response = scanner.next().charAt(0);
                System.out.println(response);
            }
        }

        response='Y';
        System.out.println("Please enter values for List 2");
        SList list2 = new SList();

        while(response == 'Y'){
            int val = scanner.nextInt();
            list2.addNode(new SListNode(val));

            System.out.println("Do you want to continue add to list 1? Enter Y for Yes else Enter N for No");
            response =  scanner.next().charAt(0);
            while(response != 'Y' && response != 'N'){
                System.out.println("Please enter a valid entry");
                System.out.println("Do you want to continue add to list 1? Enter Y for Yes else Enter N for No");
                response = scanner.next().charAt(0);
                System.out.println(response);
            }
        }

        //ADDING ELEMENTS IN BOTH LISTS
        //MAKING THE LISTS OF EQUAL LENGTH
        int size1 = list1.getSize();
        int size2 = list2.getSize();
        int diff = Math.abs(size1-size2);

        if(size1 > size2){
            while(diff > 0){
                list2.addNodeAsHead(new SListNode(0));
                diff--;
            }
        }
        else {
            while(diff > 0){
                list1.addNodeAsHead(new SListNode(0));
                diff--;
            }
        }
        SList reslist = new SList();
        int mostSigDig = addElements(list1.getHead(), list2.getHead(), reslist);
        if(mostSigDig == 1) {
            reslist.addNodeAsHead(new SListNode(1));
        }
        System.out.println(reslist.toString());
    }

    public static int addElements(SListNode node1, SListNode node2, SList reslist){
        int sum=0;
        sum=node1.getElement() + node2.getElement();
        if(node1.getNext()==null && node2.getNext() ==null){
            if(sum >=10){
                reslist.addNodeAsHead(new SListNode(sum-10));
                return 1;
            }
            else{
                reslist.addNodeAsHead(new SListNode(sum));
                return 0;
            }
        }
        else {
            int carryOver = addElements(node1.getNext(),node2.getNext(), reslist);
            sum += carryOver;
            if(sum >=10){
                reslist.addNodeAsHead(new SListNode(sum-10));
                return 1;
            }
            else{
                reslist.addNodeAsHead(new SListNode(sum));
                return 0;
            }
        }
    }
}
