package com.yohwan.study.exceptiontest;

public class FinallyReturnTest {
    public static void main(String[] args) {
        System.out.println(new FinallyReturnTest().returnTest()); // 무조건 finally에서 리턴된 값이 나옴
    }

    public String returnTest() {
        try {
            System.out.println("try");
//            throw new IllegalStateException("error"); // 에러발생시에는 catch 값까지 print한 후 finally 값이 리턴됨
            return "try";
        } catch (Exception e) {
            System.out.println("catch");
            return "catch";
        } finally {
            System.out.println("finally");
//            throw new IllegalStateException("error"); // 이런식으로도 사용 x
            return "finally"; // 이런식으로도 사용 x
        }
    }
}
