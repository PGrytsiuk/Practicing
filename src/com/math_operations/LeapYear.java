package com.math_operations;

import java.text.ParseException;

public class LeapYear {

    public static void main(String[] args) throws ParseException {

        int year = 2023;

        leapYearCheck(year);

    }

    public static void leapYearCheck(int year) {
        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
                System.out.println(isLeap);
    }
}
