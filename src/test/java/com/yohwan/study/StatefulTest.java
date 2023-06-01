package com.yohwan.study;

import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class StatefulTest {
    private int number;

    @Test @Order(1)
    void test1(){
        System.out.println(number++);//0
    }

    @Test @Order(2)
    void test2(){
        System.out.println(number++);//1
    }

    @Test @Order(3)
    void test3(){
        System.out.println(number);//2
    }
}
