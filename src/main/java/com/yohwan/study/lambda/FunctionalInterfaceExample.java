package com.yohwan.study.lambda;

import java.util.function.BinaryOperator;

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        BinaryOperator<Integer> add = (a, b) -> a + b;
        int result = add.apply(3, 5);
        System.out.println(result);
    }
}
