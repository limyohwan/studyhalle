package com.yohwan.study;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterTest {
    List<User> users = new ArrayList<>();
    @BeforeEach
    void setUp() {
        for (int i = 0; i < 2000000; i++) {
            if(i % 3 == 0) {
                users.add(new User("요환"+i, null));
            } else {
                users.add(new User("요환"+i, "dyghks7102@naver.com"));
            }
        }
    }

    @Test
    void mapFilterTest() {
        long beforeTime = System.currentTimeMillis();

        List<String> emails = users.stream()
                .map(user -> user.getEmail())
                .filter(email -> email != null)
                .collect(Collectors.toList());

        System.out.println(emails.size());

        long afterTime = System.currentTimeMillis();
        long diffTime = afterTime - beforeTime;
        System.out.println("실행 시간(ms): " + diffTime);
    }

    @Test
    void filterMapTest() {
        long beforeTime = System.currentTimeMillis();

        List<String> emails = users.stream()
                .filter(user -> user.getEmail() != null)
                .map(user -> user.getEmail())
                .collect(Collectors.toList());

        System.out.println(emails.size());

        long afterTime = System.currentTimeMillis();
        long diffTime = afterTime - beforeTime;
        System.out.println("실행 시간(ms): " + diffTime);
    }



    class User {
        String name;
        String email;

        public User(String name, String email) {
            this.name = name;
            this.email = email;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }
    }
}