package com.yohwan.study.interfacetest.old;

public class HelloJoinMember extends JoinMemberAdapter {
    // JoinMemberAdapter 를 extends 하여 원하는 메서드만 구현
    // 이 경우 상속은 한번밖에 되지 않기때문에 추가 상속을 사용하기가 어려움 -> interface 로 바뀌면 상속을 추가로 가능하게 됨
    @Override
    public void preJoin() {
        System.out.println("반갑습니다.");
    }
}
