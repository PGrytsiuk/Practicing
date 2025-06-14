package main.com.arrays_operations;

public class FindMinMaxInTheArray {

    public static void main(String[] args) {

        int[] arr = {1, 4, 12, 55, 33};

        findMinMax(arr);
    }

    public static void findMinMax(int[] arr)
    {
        int min = arr[0];
        int max = arr[0];

        for (int num : arr)
        {
            if (num < max)
            {
                min = num;
            } if (num > max) {
                max = num;
            }
        }
        System.out.println("Min: " + min + " Max: " + max);
    }
}
