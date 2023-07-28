package com.yohwan.study.generictest;

import java.util.ArrayList;
import java.util.List;

public class GenericExample {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);
        list.add(10L);
        list.add(2.5);
        list.add("hello world");

        for (Object o : list) {
            if(o instanceof Integer) {
                System.out.println((int) o);
            }
        }

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
//        list2.add(10L); // compile error
//        list2.add(2.5); // compile error
//        list2.add("hello world"); // compile error

        for (Integer integer : list2) {
            System.out.println(integer);
        }
    }
}
