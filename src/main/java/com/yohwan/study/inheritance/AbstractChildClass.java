package com.yohwan.study.inheritance;

public class AbstractChildClass extends AbstractClass{
    @Override
    public void callMyName() {
        System.out.println("abstractChildClass");
    }

    public static void main(String[] args) {
//        AbstractClass abstractClass = new AbstractClass(); 사용 불가
        AbstractClass abstractClass = new AbstractClass() { // 익명클래스 생성 가능(일회용 클래스)
            @Override
            public void callMyName() {
                System.out.println("abstractClass");
            }
        };
        abstractClass.callMyName();

        AbstractChildClass abstractChildClass = new AbstractChildClass();
        abstractChildClass.callMyName();
    }
}
