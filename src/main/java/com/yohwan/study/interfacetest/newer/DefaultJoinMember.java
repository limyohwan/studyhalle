package com.yohwan.study.interfacetest.newer;

public interface DefaultJoinMember {
    // Java8 이후에는 default 를 사용할 수 있게되어 추가로 adapter class 를 두지 않아도 됨
    default void preJoin(){
        System.out.println("반갑습니다");
    }
    default void afterJoin(){
        System.out.println("가입감사합니다");
    }
}
