package com.yohwan.study.enumtest;

import java.util.EnumMap;

public class EnumMapExample {
    enum Fruit {
        APPLE,
        BANANA,
        ORANGE
    }

    public static void main(String[] args) {
        EnumMap<Fruit, String> fruits = new EnumMap<>(Fruit.class);
        
        fruits.put(Fruit.APPLE, "사과");
        fruits.put(Fruit.BANANA, "바나나");
        fruits.put(Fruit.ORANGE, "오렌지");

        System.out.println(fruits.get(Fruit.APPLE)); //사과
    }
}
