package com.yohwan.study.enumtest;

import java.util.function.Function;

public enum EnumFunction {
    PLUS(value -> value + value),
    MINUS(value -> value - value),
    MULTIPLY(value -> value * value),
    DIVIDE(value -> value / value);

    private Function<Long, Long> expression;
    EnumFunction(Function<Long, Long> expression) {
        this.expression = expression;
    }

    public long calculate(long value) {
        return expression.apply(value);
    }

    public static void main(String[] args) {
        long result = EnumFunction.PLUS.calculate(1);
        System.out.println(result);
    }
}
