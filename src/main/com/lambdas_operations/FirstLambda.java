package main.com.lambdas_operations;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class FirstLambda {

    public static void main(String[] args) {

        //Supplier
        Supplier<String> supplier = () -> {
            System.out.println("I'm inside the supplier");
            return  "Hello";
        };

        String string = supplier.get();
        System.out.println("String = " + string);

        //Consumer
        Consumer<String> consumer = (String s) -> {
            System.out.println("I'm inside the consumer");
            System.out.println(s);
        };
        consumer.accept("Hello");
    }
}
