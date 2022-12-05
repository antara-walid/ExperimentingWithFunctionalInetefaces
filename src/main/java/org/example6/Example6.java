package org.example6;

import java.util.function.BiPredicate;

public class Example6 {
    public static void main(String[] args) {
        // BiPredicate : takes 2 values and returns a boolean

        BiPredicate<String ,Integer> bp1 = (a,b) -> a.length() == b;

        boolean b = bp1.test("walid" , 5); // returns true

        System.out.println(b);
    }
}
