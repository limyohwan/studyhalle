package com.yohwan.study.generictest;

import java.util.List;

public class GenericMethodExample {
    public <T> void print(T t) {
        System.out.println(t);
    }

    public static <T> void print(List<T> list) {
        for (T t : list) {
            System.out.println(t);
        }
    }

    public static void main(String[] args) {
        GenericMethodExample example = new GenericMethodExample();
        example.print(1);
        example.print("hello");

        example.print(List.of("one", "two", "three"));
    }
}
