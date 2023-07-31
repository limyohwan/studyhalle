package com.yohwan.study.lambda;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

public class ShadowingExample {
    public static void main(String[] args) {
        ShadowingExample shadowingExample = new ShadowingExample();
        shadowingExample.testShadowing();
    }
    private void testShadowing() {
        int baseNumber = 10;

        // 1. 로컬 클래스
        // testShadowing 내의 새로운 Scope임
        class LocalClass {
            void printBaseNumber() {
                int baseNumber = 11;
                System.out.println(baseNumber);
            }
        }

        // 2. 익명 클래스
        // testShadowing 내의 새로운 Scope임
        Consumer<Integer> consumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                int baseNumber = 11;
                System.out.println(baseNumber);
            }
        };

        // 3. 람다
        // 람다는 scope이 같으므로 같은 이름의 변수를 선언할 수 없음
        IntConsumer intConsumer = (i) -> {
//            int baseNumber = 11; // Variable 'baseNumber' is already defined in the scope
            System.out.println(i + baseNumber);
        };

        intConsumer.accept(10);
    }

}
