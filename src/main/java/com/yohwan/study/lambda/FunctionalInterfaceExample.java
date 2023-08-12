package com.yohwan.study.lambda;

import java.util.function.BinaryOperator;

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        binaryOperatorExample();

        myFunctionExample(6, 3);
    }

    private static void binaryOperatorExample() {
        BinaryOperator<Integer> add = (a, b) -> a + b;
        int result = add.apply(3, 5);
        System.out.println(result);
    }

    private static void myFunctionExample(int x, int y) {
        MyFunction add = (a, b) -> a + b;
        MyFunction minus = (a, b) -> a - b;

        int result1 = add.calculate(x, y);
        int result2 = minus.calculate(x, y);

        System.out.println("x + y : " + result1);
        System.out.println("x - y " + result2);
    }
}
