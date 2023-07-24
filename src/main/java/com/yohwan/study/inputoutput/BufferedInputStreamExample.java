package com.yohwan.study.inputoutput;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamExample {
    public static void main(String[] args) {
        //BufferedInputStream의 기본 버퍼 사이즈 = 8192
        try (BufferedInputStream stream = new BufferedInputStream(new FileInputStream("hello.txt"))) {
            int data;
            while ((data = stream.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
