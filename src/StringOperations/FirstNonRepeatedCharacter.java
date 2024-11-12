package StringOperations;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {

    public static void main(String[] args) {

        String str = "Swiss";

        findFirstNonRepeatedCharacter(str);

    }

    public static void findFirstNonRepeatedCharacter(String str){
        Map<Character, Integer> charCount = new LinkedHashMap<>();
        for (char c : str.toLowerCase().toCharArray()){
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()){
            if(entry.getValue() == 1){
                System.out.println(entry.getKey());
                break;
            }
        }
    }
}
