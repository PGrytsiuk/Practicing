package ArraysOperations;

public class LargestArrayElement {

    public static void main(String[] args) {

        int [] arr = {1 ,4,  12, 55, 33};
        int largest = arr[0];

        for (int num : arr){
            if (num > largest) {
               largest=num;

            }
        }
        System.out.println(largest);
    }
}
