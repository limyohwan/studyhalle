package com.yohwan.study.interfacetest.old;

public interface JoinMember {
    // Java8 이전에는 인터페이스에서는 나는 preJoin 만 구현하고싶었는데 DefaultJoinMember 자체를 implements 하게되면 preJoin, afterJoin 둘다 구현해야 했음
    // 그래서 interface 자체를 implements 하는게 아니라 interface 를 implements 한 adapter 클래스를 extends 하여 사용하게 된다.
    void preJoin();
    void afterJoin();
}
