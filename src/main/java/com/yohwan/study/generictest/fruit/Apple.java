package com.yohwan.study.generictest.fruit;

public class Apple extends Entity2<Integer> {
//    private Integer id;
//
//    @Override
//    public Integer getId() {
//        return id;
//    }

    public static Apple of(Integer id) {
        Apple apple = new Apple();
        apple.id = id;
        return apple;
    }
}
