package main.com.string_operations;

public class CountSpaces {

    public static void main(String[] args) {

        String test1 = "Hello world";
        String test2 = "I love automation";
        String test3 = "Test test test test";

        countSpaces1(test1);
        countSpaces2(test2);
        countSpaceswithStreams(test3);

    }

    private static void countSpaceswithStreams(String test3) {
        long spaceCount = test3.chars().filter(ch -> ch == ' ').count();
        System.out.println("amount of spaces found in the string - " + spaceCount);
    }

    public static void countSpaces1(String test1){
        int n = test1.length();

        for(int i = 0; i < n; i++){
            if(test1.charAt(i) == ' '){
                System.out.println("space found at index " + i);
            }
        }
    }

    public  static void countSpaces2(String test2){
        int index = test2.indexOf(' ');

        while (index >= 0){
            System.out.println("space found at index " + index);
            index = test2.indexOf(' ', index + 1);
        }
    }
}
