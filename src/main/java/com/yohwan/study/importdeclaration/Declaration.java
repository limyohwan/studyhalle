package com.yohwan.study.importdeclaration;
import java.lang.String;

public class Declaration {
    public static void main(String[] args) {
        // import 없을 시(물론 import있어도 이렇게 써도됨, java.lang은 기본이지만 예제로 사용함)
        java.lang.String name = "임요환";
        System.out.println(name);

        // import 시
        String name2 = "임요환2";
        System.out.println(name2);

    }
}
