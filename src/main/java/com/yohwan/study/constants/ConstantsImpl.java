package com.yohwan.study.constants;

public class ConstantsImpl implements AntiPatternConstants {
    
    // 필드의 값이 있고 없음에 따라 상수에 값이 변경되어버림
    private static final String NAME = "yohwanImpl";

    public static void main(String[] args) {
        
        // 인스턴스가 생성됨
        System.out.println(ConstantsImpl.NAME);

        // 위와 같음, 좋은 패턴이 아님
//        ConstantsImpl constants = new ConstantsImpl();
//        System.out.println(constants.NAME);
    }
}
