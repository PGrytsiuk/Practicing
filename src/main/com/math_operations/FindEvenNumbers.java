package main.com.math_operations;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FindEvenNumbers {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        findEven(numbers);

    }

    public static void findEven(List<Integer> numbers){
        // Define a predicate to check if a number is even
        Predicate<Integer> isEven = number -> number  % 2 == 0;
        // Use the predicate to filter the list
        List<Integer> evenNumbers = numbers.stream()
                                            .filter(isEven)
                                            .collect(Collectors.toList());
        System.out.println(evenNumbers);

    }

}
