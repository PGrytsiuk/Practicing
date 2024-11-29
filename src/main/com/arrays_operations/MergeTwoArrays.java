package main.com.arrays_operations;

import java.util.Arrays;

public class MergeTwoArrays {

    public static void main(String[] args) {

        int[] arr1 = {1, 3,6,7,12};
        int[] arr2 = {12, 47,123, 44,3,8};
        int[] merged = new int[arr1.length + arr2.length];
        System.arraycopy(arr1,0,merged, 0, arr1.length);
        System.arraycopy(arr2,0,merged, arr1.length, arr2.length);
        System.out.println(Arrays.toString(merged));

    }
}
