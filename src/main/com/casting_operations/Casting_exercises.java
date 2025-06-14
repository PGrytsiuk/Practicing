package main.com.casting_operations;

import org.junit.Assert;

public class Casting_exercises {

    public static void main(String[] args) {

        double d = 100.04;
        int  myInt = (int) d;
        Assert.assertNotEquals(d, myInt);
        System.out.println("myInt: " + myInt);
    }
}
