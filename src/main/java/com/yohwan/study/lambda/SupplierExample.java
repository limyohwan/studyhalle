package com.yohwan.study.lambda;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<String> getCurrentTime = () -> java.time.LocalTime.now().toString();
        String currentTime = getCurrentTime.get();
        System.out.println("현재 시간 : " + currentTime);
    }
}
