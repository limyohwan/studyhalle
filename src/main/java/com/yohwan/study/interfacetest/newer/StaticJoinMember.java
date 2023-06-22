package com.yohwan.study.interfacetest.newer;

public interface StaticJoinMember { // extends DefaultJoinGroup 선언시 = default 메서드를 static 메소드로 상속할 수 없으며 컴파일 에러 발생
    static void preJoin() {
        System.out.println("static pre join member");
    }

    static void afterJoin() {
        System.out.println("static after join member");
    }
}
