package com.simple_login;

import java.util.Scanner;

public class SimpleLogin {

    public static void main (String[] args) {

        String username = "username";
        String password = "password";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username");
        String inputUsername = scanner.nextLine();
        System.out.println("Enter password");
        String inputPassword = scanner.nextLine();
        if (username.equals(inputUsername) && password.equals(inputPassword)){
            System.out.println("Login is successful");
        }else {
            System.out.println("Invalid credentials");
        }
    }
}
