package main.com;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

import static java.lang.Integer.parseInt;
import static java.lang.String.copyValueOf;
import static java.util.logging.Level.parse;
import static org.junit.Assert.*;

public class TestClass {

    public static void main(String[] args) {

        String[] intro = new String[] { "once", "upon", "a", "time" };
        String[] abridgement = Arrays.copyOfRange(intro, 0, 3);

        System.out.println(Arrays.toString(abridgement));
        assertArrayEquals(new String[] { "once", "upon", "a" }, abridgement);
        assertFalse(Arrays.equals(intro, abridgement));

        String[] phrase = {"one two three for five six seven eight nine ten"};
        int spaceCount = Stream.of(phrase).mapToInt(el -> el.length() - el.replace(" ", "").length()).sum();
        System.out.println("Number of spaces: " + spaceCount);
        boolean containElement = Stream.of(intro).anyMatch(el -> el.contains("a"));
        System.out.println("Contained element is: " + containElement);

        String[] revised = Arrays.copyOf(intro, 3);
        String[] expanded = Arrays.copyOf(intro, 5);

        assertArrayEquals(Arrays.copyOfRange(intro, 0, 3), revised);
        assertNull(expanded[4]);
        System.out.println(Arrays.toString(revised));
        System.out.println(Arrays.toString(expanded));

        String[] stutter = new String[3];
        Arrays.fill(stutter, "once");

        assertTrue(Stream.of(stutter)
                .allMatch("once"::equals));
        System.out.println(Arrays.toString(stutter));
     /*   String str = "Hello, World!";
        String str1 = "Hello, World!";*/
   /*     System.out.println(str.charAt(4));
        System.out.println(str.codePointAt(1));
        System.out.println(str.codePointBefore(1));
        System.out.println(str.codePointCount(0, 5));*/
   /*     System.out.println(str.compareTo(str1));
        System.out.println(str.compareToIgnoreCase(str1));
        System.out.println(str.concat(str1));
        System.out.println(str.contains("Hello"));
        System.out.println(str.contentEquals(str1));*/
     /*   System.out.println(copyValueOf(str.toCharArray()));
        System.out.println(str.endsWith("!"));
        System.out.println(str.format("Hello, %s", "World"));
        System.out.println(str.getBytes());
        System.out.println(str.hashCode());
        System.out.println(str.indexOf("o"));
        System.out.println(str.intern());
        System.out.println(str.isEmpty());
        System.out.println(str.lastIndexOf("o"));*/
/*        String message = String.join("-", "Hello", "World", "!");
        System.out.println(message);
        System.out.println(str.length());
        System.out.println(str.replace("Hello", "Hi"));
        System.out.println(str.matches("Hello"));
        System.out.println(str.offsetByCodePoints(0, 5));*/

      /*  String str2 = "Hello, World!";*/

        // Find the index offset by 5 code points from index 0
     /*   int offsetIndex = str.offsetByCodePoints(0, 5);

        System.out.println("Original string: " + str2);
        System.out.println("Index offset by 5 code points from index 0: " + offsetIndex);
        System.out.println("Character at the new index: " + str.charAt(offsetIndex));
        System.out.println(str.regionMatches(0, str2, 0, 5));
        System.out.println(str.subSequence(0, 5));
        System.out.println(str.substring(0, 5));
        System.out.println(str.toCharArray());
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.trim());
        int b = 10;
        String value = String.valueOf(b);
        System.out.println(value);*/

       /* String token = System.getenv("GITHUB_TOKEN");
        System.out.printf("The token is: %s%n", token);
        String token1 = System.getenv("TRELLO_TOKEN");
        System.out.printf("The token is: %s%n", token1);*/

        /*int a = 10, b = 20;

        System.out.println("a + b = " + addTwoNumbers(a, b));
        Scanner scanner = new Scanner(System.in);

        while (true) {
        try {

            System.out.println("Enter a number: ");
            String input = scanner.nextLine();
            System.out.println("You entered: " + input);
            int c = parseInt(input);
            int d = 10 / c;
            System.out.printf("10 / %d = %d%n", c, d);
            break;

        } catch (NumberFormatException e) {
            System.out.println("Invalid number format");
        } catch (ArithmeticException e) {
            System.out.println("Division by zero");
        }
    }
      scanner.close();*/
}

/*    public static int addTwoNumbers(int a, int b) {
        b += 10;
        int sum = a + b;
        return sum;
    }*/



}
