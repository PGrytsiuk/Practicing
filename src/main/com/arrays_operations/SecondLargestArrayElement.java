package main.com.arrays_operations;

public class SecondLargestArrayElement {

    public static void main(String[] args) {

        int[] arr = {12, 15, 89, 90, 5, 3, 0};

        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {

                second = num;

            }
        }
        System.out.println(second);
    }
}
