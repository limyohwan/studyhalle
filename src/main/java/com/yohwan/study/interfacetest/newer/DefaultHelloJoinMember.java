package com.yohwan.study.interfacetest.newer;

public class DefaultHelloJoinMember implements DefaultJoinMember {
    @Override
    public void preJoin() {
        System.out.println("반갑습니다.");
    }
}
