package com.math_operations;

public class ArmstrongNumber {

    public static void main(String[] args) {

        int num=153,   sum = 0, temp = num;

        boolean isArmstrong = false;

        while(temp !=0 ){

            int digit = temp % 10;
            sum += (int) Math.pow(digit, 3);
            temp /= 10;

        }
            isArmstrong = num == sum;
        System.out.println(isArmstrong);

    }
}
