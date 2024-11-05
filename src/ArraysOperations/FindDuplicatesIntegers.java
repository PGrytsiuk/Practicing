package ArraysOperations;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicatesIntegers {

    public static void main(String[] args) {

        int[] arr = {2, 5, 2, 4, 6, 5, 8, 10};
        Set<Integer> duplicates = findDuplicats(arr);

        System.out.println("Duplicated digits" + duplicates);

    }

    public static HashSet<Integer> findDuplicats(int[] arr) {

        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int num : arr) {
            if (seen.contains(num)) {
                duplicates.add(num);
            } else {
                seen.add(num);
            }
        }
        return duplicates;
    }
}