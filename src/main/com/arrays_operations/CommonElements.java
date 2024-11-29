package main.com.arrays_operations;

import java.util.HashSet;

public class CommonElements {

    public static void main(String[] args) {

        int[] arr1 = {1, 2 ,3, 5, 6};
        int[] arr2 = {2, 5, 1, 7, 0};

        commonArrayselements(arr1, arr2);

    }

    public static void commonArrayselements(int[] arr1, int[] arr2){
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr1){
                set.add(num);
            }
        for(int num: arr2){
                if(set.contains(num)){
                System.out.println(num + " ");
            }
        }
    }
}
