package com.math_operations;

import java.util.Random;

public class RandomNumbers {

    public static void main(String[] args) {

        randomNumber(100, 5); // Random number between 0-99 with step 5
    }

    public static void  randomNumber(int num, int random_Count){
        Random random = new Random();
        for(int i = 0; i < random_Count; i++){
            System.out.println(random.nextInt(num));
        }
    }
}
