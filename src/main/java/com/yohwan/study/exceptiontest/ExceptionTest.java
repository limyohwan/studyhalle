package com.yohwan.study.exceptiontest;

public class ExceptionTest {
    public static void main(String[] args) {
//        try {
//            // do something
//        } catch (RuntimeException e){
//
//        } catch (IllegalArgumentException e) { // RuntimeException에서 예외가 이미 잡혀버림
//
//        }

        try {
            // do something 여기서 호출하는 메서드가 어떤 예외를 던지냐에 따라 catch하는 예외가 달라짐
        } catch (IllegalArgumentException e){

        } catch (RuntimeException e) {

        }

//        try {
//            // do something
//        } catch (RuntimeException | IllegalStateException e){ // 상속관계면 multi-catch 불가능
//
//        }

        try {
            // do something
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException | IllegalStateException e){
            System.out.println(e.getClass());
        }
    }
}
