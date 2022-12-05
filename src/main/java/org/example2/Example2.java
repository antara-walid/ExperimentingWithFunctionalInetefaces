package org.example2;

import java.util.Random;
import java.util.function.Supplier;

public class Example2 {
    public static void main(String[] args) {
        // Supplier: do not take any value but returns one
        Random random = new Random();
        Supplier<Integer> s1 = () -> random.nextInt(100); // should return values from 0 -> 99

        Integer test = s1.get();
        System.out.println(test);
    }
}
