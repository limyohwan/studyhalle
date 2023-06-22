package com.yohwan.study.interfacetest.newer;

public class AnonymousTest {

    public static void main(String[] args) {
        //익명내부클래스(람다로 변경 가능)
        HappyNewYear happyNewYear1 = new HappyNewYear() {
            @Override
            public void greet(String name) {
                System.out.println(name);
            }
        };

        HappyNewYear happyNewYear2 = name -> System.out.println(name);

        HappyNewYear happyNewYear3 = System.out::println;
    }
}
