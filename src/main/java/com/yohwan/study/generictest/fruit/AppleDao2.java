package com.yohwan.study.generictest.fruit;

public class AppleDao2 extends GenericDao<Apple, Integer> {
    // Apple 도메인에 특화되어있는 repository 기능이 필요할 수 있기 때문에 따로 클래스를 만듬
//    public AppleDao2() { // 타입을 넘겨주기 위해 만드는 생성자
//        super(Apple.class);
//    }
}
