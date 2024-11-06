package ArraysOperations;

import java.util.HashMap;

public class CountDuplicates {

    public static void main(String[] args) {

        int[] arr = {1 , 5 ,3, 1, 3, 5, 4, 89 ,99, 122};

        countDuplicates(arr);
    }

    public static void countDuplicates(int[] arr){
        HashMap<Integer, Integer> elementcount = new HashMap<>();

        for(int num : arr){
            elementcount.put(num, elementcount.getOrDefault(num, 0)+1);
        }

    System.out.println("Duplicates numbers and their count");
        for (int key : elementcount.keySet()){
            int count = elementcount.get(key);
            if(count > 1){
                System.out.println(key + ": " + count);
            }
        }
    }
}
