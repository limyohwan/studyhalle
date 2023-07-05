package com.yohwan.study.enumtest;

import java.util.function.Function;

public enum EnumFunctionExample {
    PLUS(value -> value + value),
    MINUS(value -> value - value),
    MULTIPLY(value -> value * value),
    DIVIDE(value -> value / value);

    private Function<Long, Long> expression;
    EnumFunctionExample(Function<Long, Long> expression) {
        this.expression = expression;
    }

    public long calculate(long value) {
        return expression.apply(value);
    }

    public static void main(String[] args) {
        long result = EnumFunctionExample.PLUS.calculate(1);
        System.out.println(result);
    }
}
