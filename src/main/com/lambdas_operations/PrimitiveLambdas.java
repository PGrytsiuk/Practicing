package main.com.lambdas_operations;

import java.util.function.DoubleToIntFunction;
import java.util.function.IntSupplier;

public class PrimitiveLambdas {

    public static void main(String[] args) {

        IntSupplier supplier = () -> 10;
        int i = supplier.getAsInt();
        System.out.println("i = " + i);

        DoubleToIntFunction function = (double value) -> (int)Math.floor(value);
        int pi = function.applyAsInt(Math.PI);
        System.out.println("Pi = "+ pi);
    }
}
