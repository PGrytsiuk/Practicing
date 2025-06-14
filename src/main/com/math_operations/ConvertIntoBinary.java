package main.com.math_operations;

public class ConvertIntoBinary {

    public static void main(String[] args) {

        int num = 10;
        String binary = convertToBinaryMethod(num);

        System.out.println(binary);
    }

    public static String convertToBinaryMethod(int num)
    {
        return Integer.toBinaryString(num);
    }
}
