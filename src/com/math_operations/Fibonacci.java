package com.math_operations;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Fibonacci {
    public static void main(String[] args) {

        int n = 15, num1=0,  num2=1;
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Fibonacci series: " + " " + num1 +" "+  num2+" "  );

        for (int i = 2; i < n; i++) {
            int num3=num1+num2;
            num1=num2;
            num2=num3;
            System.out.printf(num3 +" ");
        }
    }
}