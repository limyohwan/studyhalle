package com.yohwan.study.lambda;

import java.util.function.Consumer;

public class VariableCaptureExample {
    public static void main(String[] args) {
        // Effective final 변수 캡처
        int num1 = 10; // final이 붙어있지않지만 람다식 안에서 사실상 final로 취급됨
        Consumer<Integer> effectiveFinalConsumer = (n) -> {
            // num1은 effective final로 취급됨 (값 변경하지 않음)
//            num1 += n; 컴파일 에러 발생
            System.out.println("Effective final consumer: " + (num1 + n));
        };
        effectiveFinalConsumer.accept(5);
    }
}
