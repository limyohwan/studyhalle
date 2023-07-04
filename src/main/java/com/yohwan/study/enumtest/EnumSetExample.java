package com.yohwan.study.enumtest;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

public class EnumSetExample {
    enum Fruit {
        APPLE,
        BANANA,
        ORANGE
    }

    public static void main(String[] args) {
        Set<Fruit> fruits = new HashSet<>();
        fruits.add(Fruit.APPLE);
        fruits.add(Fruit.BANANA);
        fruits.add(Fruit.ORANGE);

        for (Fruit fruit : fruits) {
            System.out.println(fruit);
        }

        EnumSet<Fruit> fruitEnumSet = EnumSet.allOf(Fruit.class); // static factory 메서드는 내부 구현체를 숨길 수 있으며 하위타입으로 반환하여도됨, 비트연산을 하여 더 빠름

        for (Fruit fruitEnum : fruitEnumSet) {
            System.out.println(fruitEnum);
        }
    }
}
