package com.yohwan.study.interfacetest;

// 접근제어자 interface 인터페이스 이름
public interface MyInterface {
    // 상수 필드
    int MAX_VALUE = 10;
    // public static final int MAX_VALUE = 10;

    // 추상 메서드 선언
    void method1();
    int method2(String str);
    void method3(int num);
    // public abstract void method3(int num);
}