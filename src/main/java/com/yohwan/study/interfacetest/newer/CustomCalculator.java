package com.yohwan.study.interfacetest.newer;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public interface CustomCalculator {
    // 입력받은 숫자들 중 짝수만 더함
    default int addEvenNumbers(int... nums) {
        return add(n -> n % 2 == 0, nums);
    }

    // 입력받은 숫자들 중 홀수만 더함
    default int addOddNumbers(int... nums) {
        return add(n -> n % 2 != 0, nums);
    }

    private int add(IntPredicate predicate, int[] nums){
        return IntStream.of(nums)
                .filter(predicate)
                .sum();
    }
}