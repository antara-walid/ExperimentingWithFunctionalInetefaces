package org.example1;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Example1 {
    public static void main(String[] args) {
        // Consumer: consume a value and does not return anything
        Consumer<String> c1 = s -> System.out.println(s);
        c1.accept("hello");


        // BiConsumer: consume 2 values and does not return anything
        BiConsumer<Integer,String> c2 = (a,b) -> System.out.println(a + " " + b);
        c2.accept(27,"test");
    }
}
