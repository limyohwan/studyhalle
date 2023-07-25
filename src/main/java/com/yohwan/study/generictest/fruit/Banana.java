package com.yohwan.study.generictest.fruit;

public class Banana extends Entity2<Integer> {
//    private Integer id;
//
//    @Override
//    public Integer getId() {
//        return id;
//    }

    public static Banana of(Integer id) {
        Banana banana = new Banana();
        banana.id = id;
        return banana;
    }
}
