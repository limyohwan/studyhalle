package com.yohwan.study.inputoutput;

import java.io.*;

public class BufferedReaderExample {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("hello.txt"))) {
            int data;
            while ((data = reader.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
