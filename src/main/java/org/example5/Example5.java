package org.example5;

import java.util.function.Predicate;

public class Example5 {
    public static void main(String[] args) {
        // Predicate : takes a value and returns a boolean

        Predicate<Integer> p1 = a -> a%2 == 0;

        boolean b = p1.test(2); // returns true

        System.out.println(b);
    }
}
