package com.yohwan.study.objectbook.alice;

public class Fan {

    public void shake(Alice alice) {
        System.out.println("부채질 휙휙");
        alice.changeHeight(alice.getHeight() - 20);
    }
}
