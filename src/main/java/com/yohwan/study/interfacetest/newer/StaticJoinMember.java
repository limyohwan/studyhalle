package com.yohwan.study.interfacetest.newer;

public interface StaticJoinMember {
    static void preJoin() {
        System.out.println("static pre join member");
    }

    static void afterJoin() {
        System.out.println("static after join member");
    }
}
