package com.yohwan.study.interfacetest;

// 접근제어자 class 클래스이름 implements 인터페이스이름
public class MyClass implements MyInterface {
    // 인터페이스 메서드 구현
    public void method1() {
        // 메서드 구현
        System.out.println("method1");
    }

    public int method2(String str) {
        // 메서드 구현
        System.out.println("method2 : " + str);
        return 0;
    }

    public void method3(int num) {
        // 메서드 구현
        System.out.println("method3");
    }

    public static void main(String[] args) {
        MyInterface myInterface = new MyClass();
        myInterface.method1();
    }
}