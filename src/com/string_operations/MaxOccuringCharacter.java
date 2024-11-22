package com.string_operations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MaxOccuringCharacter {

    public static void main (String[] args) {
        String str = "programming";
        findMaxOccurringCharacter(str);
        findMaxOccurringCharacters(str);
    }

    public static void findMaxOccurringCharacter(String str) {
        HashMap<Character, Integer> charCount = new HashMap<>();
        for(char c : str.toCharArray()){
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        char maxChar = str.charAt(0);
        int maxCount = 0;
        for (char c : charCount.keySet()){
            if(charCount.get(c) > maxCount){
                maxCount = charCount.get(c);
                maxChar = c;
            }

        }
        System.out.println(maxChar);
    }

    public static void findMaxOccurringCharacters(String str) {
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (char c : str.toCharArray()){
            charCount.put(c, charCount.getOrDefault(c, 0)+1);
        }

        int maxCount = 0;
        for (int count : charCount.values()){
            maxCount = Math.max(maxCount, count);
        }
        List<Character> maxChars = new ArrayList<>();
        for (char c : charCount.keySet()){
            if(charCount.get(c) == maxCount){
                maxChars.add(c);
            }
        }
        System.out.println("Characters with max occurrences (" + maxCount + "): " + maxChars);
    }
}
