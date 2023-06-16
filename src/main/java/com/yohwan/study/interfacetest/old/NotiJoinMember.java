package com.yohwan.study.interfacetest.old;

public class NotiJoinMember extends JoinMemberAdapter{

    @Override
    public void afterJoin() {
        System.out.println("멤버용 새 글이 올라왔어요.");
    }
}
