package com.yohwan.study.interfacetest.newer;

public class DefaultNotiJoinMember implements DefaultJoinMember {
    @Override
    public void afterJoin() {
        System.out.println("멤버용 새 글이 올라왔어요.");
    }
}
