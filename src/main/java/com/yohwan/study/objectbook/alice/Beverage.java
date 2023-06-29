package com.yohwan.study.objectbook.alice;

public class Beverage {
    private int amount;

    public Beverage(int amount) {
        this.amount = amount;
    }

    public void decrease(Alice alice) {
        if(amount - 10 < 0) {
            throw new IllegalStateException("양이 모자랍니다.");
        }

        this.amount -= 10;
        System.out.println("음료의 남은 양 : " + this.amount);
        alice.changeHeight(24);
    }
}
