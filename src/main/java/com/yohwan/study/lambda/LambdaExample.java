package com.yohwan.study.lambda;

import java.util.List;

public class LambdaExample {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        // (parameter) -> expression
        numbers.forEach(number -> System.out.println(number));
    }
}
