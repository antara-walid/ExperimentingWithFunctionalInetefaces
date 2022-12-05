package org.example4;

import java.util.function.BiFunction;

public class Example4 {

    public static void main(String[] args) {
        // BiFunction : consumes 2 values and returns one

        BiFunction<Integer,Integer ,Double> bf = (a,b) -> (double)a/b;

        double result = bf.apply(13,2); // result -> 6.5

        System.out.println(result);
    }
}
