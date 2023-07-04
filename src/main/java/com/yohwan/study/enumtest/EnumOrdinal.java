package com.yohwan.study.enumtest;

public class EnumOrdinal {
    enum Order {
        ONE, TWO, THREE
    }

    enum Order2 {
        ZERO, ONE, TWO, THREE
    }

    public static void main(String[] args) {
        System.out.println(Order.ONE.ordinal()); // 0
        System.out.println(Order.TWO.ordinal()); // 1
        System.out.println(Order.THREE.ordinal()); // 2

        if(Order.ONE.ordinal() == 0) {
            System.out.println("true");
        }

        // 만약 ONE 앞에 ZERO가 추가된다면?
        System.out.println(Order2.ONE.ordinal()); // 1
        System.out.println(Order2.TWO.ordinal()); // 2
        System.out.println(Order2.THREE.ordinal()); // 3

        if(Order2.ONE.ordinal() == 0) {
            System.out.println("true"); // 동작하지 않음 왜냐면 ZERO가 앞에 추가되어 순서값이 변경됨
        }
        
        // ordinal()로 로직을 작성하는 것은 매우 위험함

    }
}
