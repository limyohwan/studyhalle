package com.yohwan.study.generictest;

import java.util.ArrayList;
import java.util.List;

public class BoundedTypeExample<T extends Number> {
    private T value;

    public BoundedTypeExample(T value) {
        this.value = value;
    }

    public double square() {
        return value.doubleValue() * value.doubleValue();
    }

    public static void addNumbers(List<? super Integer> list) {
        list.add(1);
        list.add(2);
        list.add(3);
    }

    public static void main(String[] args) {
        BoundedTypeExample<Integer> intExample = new BoundedTypeExample<>(10);
        System.out.println(intExample.square());

        // 컴파일 에러! String은 Number의 하위 클래스가 아님.
        // BoundedTypeExample<String> strExample = new BoundedTypeExample<>("Hello");

        List<Number> numberList = new ArrayList<>();
        numberList.add(10.5); // double 값 추가

        List<Object> objectList = new ArrayList<>();
        objectList.add("Hello"); // String 값 추가

        addNumbers(numberList); // Integer의 하위 클래스인 Number 리스트에 1, 2, 3 추가
        addNumbers(objectList); // Integer의 상위 클래스인 Object 리스트에 1, 2, 3 추가

        System.out.println("Number list: " + numberList); // Number list: [10.5, 1, 2, 3]
        System.out.println("Object list: " + objectList); // Object list: [Hello, 1, 2, 3]
    }
}
