package com.string_operations;

public class RemoveWhiteSpaces {

    public static void main(String[] args) {

        String test = "A u t o m a t i o n";
        removeWhiteSpace(test);

    }

    public static void removeWhiteSpace(String test){
        String result = test.replaceAll("\\s+", "");
        System.out.println(result);

    }
}
