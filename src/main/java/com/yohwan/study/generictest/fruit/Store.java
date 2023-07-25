package com.yohwan.study.generictest.fruit;

import java.util.List;

public class Store {
    public static void main(String[] args) {
//        AppleDao appleDao = new AppleDao();
        AppleDao2 appleDao = new AppleDao2();
//        GenericDao<Apple, Integer> appleDao = new GenericDao<>();
        appleDao.save(Apple.of(1));
        appleDao.save(Apple.of(2));

        List<Apple> all = appleDao.findAll();
        for (Apple apple : all) {
            System.out.println(apple);
        }

        System.out.println(appleDao.getEntityClass());

        GenericDao<Apple, Integer> appleDao2 = new GenericDao<>();
        System.out.println(appleDao2.getEntityClass()); // 에러 발생, 이렇게 선언시는 타입을 꺼낼 수 없음, 상속이 되어야 ParameterizedType을 꺼낼 수 있음
    }
}
