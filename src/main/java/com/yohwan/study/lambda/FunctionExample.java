package com.yohwan.study.lambda;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<String, Integer> parseToInt = s -> Integer.parseInt(s); // (s) -> Integer.parseInt(s), Integer::parseInt
        int result = parseToInt.apply("42");

        System.out.println("Parsed integer: " + result);
    }
}
