package com.yohwan.study.inputoutput;

import java.io.FileReader;
import java.io.IOException;

public class ReaderExample {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("hello.txt")) {
            int data;
            while ((data = reader.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
