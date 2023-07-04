package com.yohwan.study.enumtest;

public class EnumExample {

    enum Greet {
        HELLO("hello");

        private String message;

        Greet(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }
    }

    public static void main(String[] args) {
        System.out.println("hello"); // hello 문자열은 type safety 하지 않음
        System.out.println("hrllo"); // 무조건 hello라는 문자열이 필요한 로직에서 사람인 이상 실수로 오타를 발생할 수 있음

        System.out.println(Greet.HELLO.getMessage()); // enum을 사용하여 오타 등을 방지하고 type safety하게 처리할 수 있음
//        System.out.println(Greet.HRLLO.getMessage()); // 오타시 컴파일 에러 발생
    }
}
