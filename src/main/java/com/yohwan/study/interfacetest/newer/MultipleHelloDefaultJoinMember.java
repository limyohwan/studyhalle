package com.yohwan.study.interfacetest.newer;

public class MultipleHelloDefaultJoinMember implements DefaultJoinMember, DefaultJoinGroup {
    // 메서드가 동일한 두개의 인터페이스를 구현할 때 무조건 override 를 해야함 아니면 컴파일 에러
    // 두개의 메서드가 default 이든 아니든 무조건 override 하지않으면 컴파일 에러
    @Override
    public void preJoin() {
//        DefaultJoinMember.super.preJoin(); // 두 인터페이스 다 사용하거나
//        DefaultJoinGroup.super.preJoin();
        System.out.println("그룹 멤버 가입 감사합니다."); // 새로 정의하거나
    }

    @Override
    public void afterJoin() {
        DefaultJoinMember.super.afterJoin(); // 둘 중 하나를 사용하거나
    }
}
