package main.com.arrays_operations;

public class BubbleSort {

    public static void main(String[] args) {

        int[] arr = {12, 5, 77, 3, 0, 89};
        int n = arr.length;

        for (int i = 0; i < n -1; i++){
            for (int j = 0; j < n - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int num  : arr){
            System.out.println(num + "");
        }
    }
}
