package com.math_operations;

public class SumOfNaturalNumbers {

    public static void main(String[] args) {

        int n = 10;
        int sum = 0;
        for(int i = 0; i <= n; i++){
            sum +=i;
        }
        System.out.println(sum);

        sumOfNaturalNumbers(n);
    }

    public static void sumOfNaturalNumbers(int n){
        int sumNaturalNumbers = n * (n + 1)/2;
        System.out.println(sumNaturalNumbers);
    }
}
