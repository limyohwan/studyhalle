package com.yohwan.study.exceptiontest;

public class CustomException extends RuntimeException{
    public CustomException(String message, Throwable cause) {
        super(message, cause);
    }

    public static void main(String[] args) {
        try {
            // do something
        } catch (Exception e) {
            throw new CustomException("message", e); // root cause(= e) 보내기
        }
    }
}
