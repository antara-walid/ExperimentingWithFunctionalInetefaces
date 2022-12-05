package org.example3;

import java.util.function.Function;

public class Example3 {

    public static void main(String[] args) {
        // Function : takes a parameter and returns a parameter
        Function<String, Integer> f = s -> s.length();
        f.apply("walid"); // returns 5
    }
}
