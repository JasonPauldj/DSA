package com.company;

public class Main {

    public static void main(String[] args) {
        TowerOfHanoi(3, 'f','t','a');
    }
    
    static void  TowerOfHanoi(int n, char from, char to, char aux){
        if(n==1){
            System.out.println("moving " + n + " " + from + " " + to);
            return;
        }

        TowerOfHanoi(n-1,from,aux,to);
        System.out.println("moving " + n + " " + from + " " + to);

        TowerOfHanoi(n-1,aux,to,from);
    }
}
