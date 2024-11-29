package main.com.math_operations;

public class PerfectNumber {

    public static void main(String[] args) {

        int num = 28;

        checkPerfectNumber(num);

    }

    public static void checkPerfectNumber(int num){
        int sum = 0;
        boolean isPerfectNumber;

        for (int i = 1; i <= num/2; i++){
            if(num % i == 0){
                sum += i;
            }
        }
        isPerfectNumber = sum == num;
        System.out.println(isPerfectNumber);
    }

}
