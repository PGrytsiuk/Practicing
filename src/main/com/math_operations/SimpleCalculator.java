package main.com.math_operations;

import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number and press Enter: ");
        double num1 = scanner.nextDouble();
        System.out.println("Enter second number and press Enter: ");
        double num2 = scanner.nextDouble();
        System.out.println("Choose operation +,-,*,/ and press Enter: " );
        char operation = scanner.next().charAt(0);
        double result = switch (operation) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            case '/' -> num1 / num2;
            default -> throw new IllegalArgumentException("Invalid operation");
        };
        System.out.println("Result: " + result);
        scanner.close();
    }

}
