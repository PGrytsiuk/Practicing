package main.com.string_operations;

public class CountCharacter {

    public static void main(String[] args) {

        String word = "Automation";
        char ch = 'a';
        int count = 0;

        for (char c : word.toLowerCase().toCharArray()){
            if(ch == c){
                count ++;
            }
        }
        System.out.println(count);
    }
}
