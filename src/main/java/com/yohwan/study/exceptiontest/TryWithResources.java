package com.yohwan.study.exceptiontest;

import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {
    public static void main(String[] args) {

    }

    private void tryCatchFinally() {
        FileReader reader = null;
        try {
            reader = new FileReader("file.txt");
            // 파일 읽기 작업 수행
            // 예외가 발생할 수 있는 코드
        } catch (IOException e) {
            // 예외 처리 코드
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    // 자원 해제 실패에 대한 예외 처리
                }
            }
        }
    }

    private void tryWithResources() {
        try (FileReader reader = new FileReader("file.txt")) {
            // 파일 읽기 작업 수행
            // 예외가 발생할 수 있는 코드
        } catch (IOException e) {
            // 예외 처리 코드
        }
    }
}
