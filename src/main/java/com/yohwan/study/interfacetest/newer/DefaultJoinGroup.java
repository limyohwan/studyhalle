package com.yohwan.study.interfacetest.newer;

public interface DefaultJoinGroup {
    default void preJoin(){
        System.out.println("그룹 반갑습니다");
    }
    default void afterJoin(){
        System.out.println("그룹 가입감사합니다");
    }
}
