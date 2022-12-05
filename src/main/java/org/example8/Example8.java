package org.example8;

import java.util.function.BinaryOperator;

public class Example8 {

    public static void main(String[] args) {
        // BinaryOperator : takes 2 values and returns a value of the same type

        BinaryOperator<Integer> b1 = (a,b) -> a+b;

        int result = b1.apply(2,8) ; // returns 10

        System.out.println(result);
    }



}
