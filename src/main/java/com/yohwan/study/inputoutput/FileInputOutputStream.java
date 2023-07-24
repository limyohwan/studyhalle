package com.yohwan.study.inputoutput;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileInputOutputStream {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("hello.txt");
             FileWriter fw = new FileWriter("hello2.txt")) {

            char[] buffer = new char[1024];
            int charsRead;
            while ((charsRead = fr.read(buffer)) != -1) {
                fw.write(buffer, 0, charsRead);
            }

            System.out.println("파일이 복사되었습니다.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
