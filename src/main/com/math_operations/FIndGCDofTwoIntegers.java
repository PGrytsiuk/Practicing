package main.com.math_operations;

public class FIndGCDofTwoIntegers {

    public static void main(String[] args) {

        int num1 = 12, num2 = 15;
        int gcd = findGCDofTwoNumbers(num1, num2);
        System.out.println("The common GCD of two numbers is " + gcd);

        while(num2 != 0){
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;

            System.out.println("GCD of " + num1 + " and " + num2);

        }
        System.out.println("The common GCD of two numbers is " + num1);
    }

    public static int findGCDofTwoNumbers(int num1, int num2)
    {
        while(num2 != 0){
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }
}
