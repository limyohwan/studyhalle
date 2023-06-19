package com.yohwan.study.interfacetest.newer;

public class StaticJoinMemberImpl implements StaticJoinMember {

    public static void main(String[] args) {
        StaticJoinMemberImpl member = new StaticJoinMemberImpl();
//        member.preJoin(); // 불가능
//        StaticJoinMemberImpl.preJoin(); // 불가능
        StaticJoinMember.preJoin(); // 이렇게만 사용 가능
    }
}
