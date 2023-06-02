package com.yohwan.study.classtest;

public class ClassTest { // 클래스 이름
    String constructorVal; // 필드, 인스턴스 변수
    String instanceVal; // 필드, 인스턴스 변수
    static String classVal; // 필드, 클래스 변수

    { // 인스턴스 초기화 블록
        System.out.println(this.instanceVal);
        this.instanceVal = "instance";
        System.out.println(this.instanceVal);
    }

    static { // 클래스 초기화 블록
        System.out.println(classVal);
        classVal = "class";
        System.out.println(classVal);
    }

    public ClassTest(){
        // super(); // 상속시 super 생성자 생략되어있음
    }

    public ClassTest(String constructorVal) { // 생성자
        // super(); // 상속시 super 생성자 생략되어있음
        this.constructorVal = constructorVal;
    }

    public void callMyNameWithCount(int count){ // 인스턴스 메소드
        String myName = this.getClass().getName();// 지역 변수
        for(int i = 0; i < count; i++){
            System.out.println(myName);
        }
    }

    public static void callMyClassVal(){ // 클래스 메소드
        System.out.println(classVal);
    }

    public static void main(String[] args) {
        ClassTest instance = new ClassTest("constructor");
        instance.callMyNameWithCount(5);

        ClassTest.callMyClassVal();
    }
}