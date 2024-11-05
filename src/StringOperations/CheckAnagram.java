package StringOperations;

import java.util.Arrays;

public class CheckAnagram {

    public static void main(String[] args) {

        String str1 = "Listen", str2 = "Silent";

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println(Arrays.equals(arr1, arr2));
    }
}
