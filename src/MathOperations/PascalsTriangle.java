package MathOperations;

public class PascalsTriangle {

    public static void main(String[] args) {
        int rowsNumbers = 10;

        generatePascalsTriangle(rowsNumbers);

    }

    public static void generatePascalsTriangle (int rowsNumbers) {

        for (int i = 0; i < rowsNumbers; i++) {
            int number = 1;
            System.out.format("%" + (rowsNumbers - i) * 2 + "s", ""); // Formatting for triangular shape
            for (int j = 0; j <= i; j++) {
                System.out.format("%4d", number);
                number = number * (i - j) / (j + 1);

            }

            System.out.println();
        }
    }
}
