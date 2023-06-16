package com.yohwan.study.interfacetest.old;

public class JoinMemberAdapter implements JoinMember {
    // 원하는 메서드만 사용하기 위한 adapter 클래스
    // 이게 adapter 패턴은 아니고 편의성으로 사용하는 거임
    // HandlerInterceptor 클래스, XXXConfigurer, XXXConfiguration, XXXConfigurerAdapter
    @Override
    public void preJoin() {
        System.out.println("반갑습니다");
    }

    @Override
    public void afterJoin() {
        System.out.println("가입감사합니다");
    }
}
