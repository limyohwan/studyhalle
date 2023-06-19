package com.yohwan.study.interfacetest.newer;

public class DefaultNotiJoinMember implements DefaultJoinMember, StaticJoinMember {
    @Override
    public void afterJoin() {
        System.out.println("멤버용 새 글이 올라왔어요.");
    }

    public static void main(String[] args) {
        DefaultNotiJoinMember member = new DefaultNotiJoinMember();
        member.preJoin(); // StaticJoinMember 의 메서드는 호출되지 않음
        StaticJoinMember.preJoin(); // StaticJoinMember 의 메서드를 호출하기 위해서는 직접 호출해야됨
    }
}
