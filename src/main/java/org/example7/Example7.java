package org.example7;

import java.util.function.UnaryOperator;

public class Example7 {
    public static void main(String[] args) {
       //  UnaryOperator : takes a value and returns a values of the same type

        UnaryOperator<Integer> u1 = a ->a*2;

        int result = u1.apply(2);

        System.out.println(result); // returns 4
    }
}
