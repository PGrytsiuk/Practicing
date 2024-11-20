package com.math_operations;

import java.text.ParseException;
import java.util.function.Predicate;

public class LeapYear {

    public static void main(String[] args) throws ParseException {

        int year = 2023;

        leapYearCheck(year);
       boolean isLeap = checkLeapYearUsingPredicate(year);
       System.out.println(isLeap);

    }

    public static void leapYearCheck(int year) {
        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
                System.out.println(isLeap);
    }

    public static boolean checkLeapYearUsingPredicate(int year) {
        Predicate <Integer> isLeap = y -> (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);
        return isLeap.test(year);
    }
}
