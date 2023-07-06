package com.yohwan.study.annotation;

import java.lang.reflect.Field;

public class HelloFieldMain {
    public static void main(String[] args) {
        Field[] fields = HelloController.class.getFields(); // getFields()는 public 필드만 나옴
        for (Field field : fields) {
            System.out.println(field);
        }

        System.out.println("---------------");

        Field[] fields2 = HelloController.class.getDeclaredFields();  // getDeclaredFields()는 해당 클래스에 선언된 모든 필드가 나옴
        for (Field field2 : fields2) {
            System.out.println(field2);
        }

        System.out.println("---------------");

        Field[] fields3 = MyHelloController.class.getFields();  // getFields()는 public 필드만 나옴(부모필드 포함)
        for (Field field3 : fields3) {
            System.out.println(field3);
        }

        System.out.println("---------------");

        Field[] fields4 = MyHelloController.class.getDeclaredFields();  // getDeclaredFields()는 해당 클래스에 선언된 모든 필드가 나옴(부모필드 제외)
        for (Field field4 : fields4) {
            System.out.println(field4);
        }
    }
}
