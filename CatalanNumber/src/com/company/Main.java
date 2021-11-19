package com.company;

public class Main {
    public static void main(String[] args) {
        System.out.println(catalanNumberBionomialCoeff(10));
    }

    public static int catalanNumberRecursion(int n){
        if(n==0 || n==1)
            return 1;
        int res =0;
        for(int i=0;i<=n-1;i++)
        {
            res+= catalanNumberRecursion(i)*catalanNumberRecursion(n-i-1);
        }
            return res;
    }
    public static int catalanNumberDynamic(int n){
        int[] catalan = new int[n + 2];

        // Initialize first two values in table
        catalan[0] = 1;
        catalan[1] = 1;

        // Fill entries in catalan[]
        // using recursive formula
        for (int i = 2; i <= n; i++) {
            catalan[i] = 0;
            for (int j = 0; j < i; j++) {
                catalan[i]
                        += catalan[j] * catalan[i - j - 1];
            }
        }

        // Return last entry
        return catalan[n];
    }

    public static int catalanNumberBionomialCoeff(int n){
        int res;
        res = bionimalCoeff(2*n,n);
        res /= n+1;

        return res;
    }

    public static int bionimalCoeff(int n, int r)
    {
        int res=1;

        if(r>n-r)
        {
        r=n-r;
        }
        for(int i=1; i<=r;i++){
            res *= n+1-i;
            res /=i;
        }
        return res;
    }
    }
