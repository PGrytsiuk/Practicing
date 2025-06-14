package main.com.arrays_operations;

public class FizzBuzz {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 15, 16, 18, 20};
        fizzBuzz(arr);
    }

    public static void fizzBuzz(int[] arr)
    {
        for(int num : arr)
        {
            if(num % 3 == 0 && num % 5 == 0)
            {
                System.out.println(("FizzBuzz"));
            }
            else if(num % 3 == 0)
            {
                System.out.println("Fizz");
            }
            else if(num % 5 == 0)
            {
                System.out.println("Buzz");
            }
            else
            {
                System.out.println(num);
            }
        }
    }
}
