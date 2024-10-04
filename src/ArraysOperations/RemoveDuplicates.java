package ArraysOperations;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

    public static void main(String[] args) {

        int [] arr= {1, 5, 6, 1, 5, 6, 7, 8, 9};

        HashSet<Integer> set = new HashSet<>();
        for (int num : arr){
            set.add(num);

        }
        System.out.println(set);
    }

}
