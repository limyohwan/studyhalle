package com.yohwan.study.lambda;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        List<String> names = List.of("Lim", "Yo", "Hwan");
        Consumer<String> printName = (name) -> System.out.println(name);

        names.forEach(printName);
    }
}
