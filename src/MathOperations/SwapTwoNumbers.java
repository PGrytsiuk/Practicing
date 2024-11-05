package MathOperations;

public class SwapTwoNumbers {

    public static void main(String[] args) {

        int a = 10, b = 15;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a = " + a + "\n" + "b = " + b);
    }
}
