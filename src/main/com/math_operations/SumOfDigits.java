package main.com.math_operations;

public class SumOfDigits {

    public static void main(String[] args) {

        int num = 123456;

        sumOFdigits(num);
    }

    public static void sumOFdigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println(sum);
    }
}
