package com.yohwan.study.lambda;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> isGreaterThanZero = (i) -> i > 0;
        boolean result1 = isGreaterThanZero.test(10);
        boolean result2 = isGreaterThanZero.test(-1);

        System.out.println("10은 0보다 큰가? " + result1);
        System.out.println("-1은 0보다 큰가? " + result2);
    }
}
