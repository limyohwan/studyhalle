package com.yohwan.study.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class MethodReferenceExample {
    public static void main(String[] args) {
        String[] names = {"lim", "yo", "hwan"};

        // 기본적으로 Comparator 사용하는 방법
        Arrays.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        // 람다식
        Arrays.sort(names, (o1, o2) -> o1.compareTo(o2));

        // 메서드 레퍼런스
        // (this, o2) -> this.compareTo(o2) 이러한 형식으로 람다식이 매핑이 되었다고 생각하면 됨
        Arrays.sort(names, String::compareTo);
    }
}
