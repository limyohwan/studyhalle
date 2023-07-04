package com.yohwan.study.enumtest;

import java.util.Comparator;
import java.util.List;

public class OrderTip {
    static int kiwi = 10;
    static int apple = 25;
    static int banana = 20;
    static int melon = 30;

    public static void main(String[] args) {
        List<Integer> fruits = new java.util.ArrayList<>(List.of(kiwi, banana, melon));
        fruits.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });

        for (Integer fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
