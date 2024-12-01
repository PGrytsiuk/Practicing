package main.com.arrays_operations;


import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int [] arr ={12, 5, 57, 7, 10, 11, 4, 8, 6};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        arraySortWithStreams(arr);
    }

    public static void  arraySortWithStreams(int[] arr){
        int[] array = Arrays.stream(arr).sorted().toArray();
        System.out.println("Sorted numbers" + Arrays.toString(array));
    }

}
