package com.yohwan.study.inputoutput;

import java.io.*;

public class OutputStreamExample {
    public static void main(String[] args) {
        try (OutputStream stream = new FileOutputStream("bye.txt")) {
            String content = "bye world!!!";
            byte[] data = content.getBytes();
            stream.write(data);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
