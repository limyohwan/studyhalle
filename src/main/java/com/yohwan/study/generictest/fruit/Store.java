package com.yohwan.study.generictest.fruit;

import java.util.List;

public class Store {
    public static void main(String[] args) {
        AppleDao2 appleDao = new AppleDao2();
        appleDao.save(Apple.of(1));
        appleDao.save(Apple.of(2));

        List<Apple> all = appleDao.findAll();
        for (Apple apple : all) {
            System.out.println(apple);
        }
    }
}
