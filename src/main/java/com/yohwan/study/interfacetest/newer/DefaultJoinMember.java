package com.yohwan.study.interfacetest.newer;

public interface DefaultJoinMember extends StaticJoinMember {
    // StaticJoinMember 를 상속해도 기존 DefaultJoinMember 의 메서드는 override 한게 아님
    // static 메서드 자체가 오버라이딩이 가능하지 않음
    // Java8 이후에는 default 를 사용할 수 있게되어 추가로 adapter class 를 두지 않아도 됨
    
    default void preJoin(){
        printMessage("멤버 반갑습니다");
    }

    default void afterJoin(){
        printMessage("멤버 가입감사합니다");
    }

    private void printMessage(String message) { // private 메서드를 이용하여 default 메서드의 공통 로직을 메서드로 추출할 수 있음
        System.out.println(message);
    }
}
