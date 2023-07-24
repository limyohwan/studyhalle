package com.yohwan.study.inputoutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StandardStreamExample {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("이름을 입력하세요 : ");
            String name = reader.readLine();
            System.out.println("입려한 이름은 : " +  name);
            throw new IllegalStateException();
        } catch (Exception e) {
            System.err.println("에러입니당");
            throw new RuntimeException(e);
        }
    }
}
