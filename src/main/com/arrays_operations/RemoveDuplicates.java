package main.com.arrays_operations;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicates {

    public static void main(String[] args) {

        int [] arr= {1, 5, 6, 1, 5, 6, 7, 8, 9};

        HashSet<Integer> set = new HashSet<>();
        for (int num : arr){
            set.add(num);

        }
        System.out.println(set);

        removeDuplicatesWithStreams(arr);
    }

    public static void removeDuplicatesWithStreams(int[] arr){
        int[] array = Arrays.stream(arr).distinct().toArray();
        System.out.println(Arrays.toString(array));
    }
}
