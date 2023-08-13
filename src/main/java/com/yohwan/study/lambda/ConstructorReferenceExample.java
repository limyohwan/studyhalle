package com.yohwan.study.lambda;

import java.util.List;

public class ConstructorReferenceExample {
    public static void main(String[] args) {
        List<String> names = List.of("Lim", "Yo", "Hwan");
        // 람다식
        names.forEach(name -> new User(name));

        // 생성자 레퍼런스
        names.forEach(User::new);
    }
    static class User {
        String name;

        public User(String name) {
            this.name = name;
        }
    }
}
