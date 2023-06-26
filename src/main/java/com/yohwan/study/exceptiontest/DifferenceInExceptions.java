package com.yohwan.study.exceptiontest;

public class DifferenceInExceptions {
    public static void main(String[] args) {

    }

    public void callRuntimeException() {
        runtimeException();
    }

    public void callCheckedException() throws Exception { //예외를 던지던가
        checkedException(); // 예외를 try catch로 잡던가
    }

    private void runtimeException() {
        throw new IllegalArgumentException();
    }

    private void checkedException() throws Exception {
        throw new Exception();
    }
}
