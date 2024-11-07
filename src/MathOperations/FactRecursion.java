package MathOperations;

public class FactRecursion {

    public static void main(String[] args) {

        int factorial = 5;

        System.out.println(factorialWithRecursion(factorial));

    }

    public static int factorialWithRecursion(int factorial){
        if(factorial == 0) {
            return 1;
        }
        return factorial * factorialWithRecursion((factorial - 1));
    }

}
