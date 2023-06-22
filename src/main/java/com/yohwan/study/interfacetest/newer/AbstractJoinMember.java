package com.yohwan.study.interfacetest.newer;

public abstract class AbstractJoinMember implements DefaultJoinMember {
    private String message = "추상 클래스는 필요가 없을까?";
    // 추상 클래스는 상태에 따라 값을 변경할 수 있다
    // 자바 8버전 아래에서는 인터페이스에서 private 메서드를 사용할 수 없어 중복코드를 제거하기 어려움

    @Override
    public void preJoin() {
        System.out.println(message);
    }

    public void setMessage(String message) {
        this.message = message;
    }
}