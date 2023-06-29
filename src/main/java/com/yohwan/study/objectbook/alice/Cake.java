package com.yohwan.study.objectbook.alice;

public class Cake {
    private int amount;

    public Cake(int amount) {
        this.amount = amount;
    }

    public void decrease(Alice alice) {
        if(amount - 10 < 0) {
            throw new IllegalStateException("양이 모자랍니다.");
        }

        this.amount -= 10;
        System.out.println("케이크의 남은 양 : " + this.amount);

        alice.changeHeight(alice.getHeight() + 150);
    }
}
