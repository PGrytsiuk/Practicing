package MathOperations;

public class FIndGCDofTwoIntegers {

    public static void main(String[] args) {

        int num1 = 12, num2 = 15;

        while(num2 != 0){
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;

            System.out.println("GCD of " + num1 + " and " + num2);

        }
        System.out.println("The common GCD of two numbers is " + num1);

    }

}
