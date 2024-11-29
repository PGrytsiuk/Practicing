package main.com.string_operations;

public class PolindromTest {
    public static void main(String[] args) {
        String str = "radar";
        StringBuilder polindrom = new StringBuilder(str);
       polindrom.reverse();


        System.out.println(polindrom);
        System.out.println(str.contentEquals(polindrom));
    }
}
