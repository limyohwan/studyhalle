package com.yohwan.study.objectbook.alice;

public class Mushroom {
    private int leftAmount;
    private int rightAmount;

    public Mushroom(int leftAmount, int rightAmount) {
        this.leftAmount = leftAmount;
        this.rightAmount = rightAmount;
    }

    public void decreaseLeft(Alice alice) {
        if(leftAmount - 10 < 0) {
            throw new IllegalStateException("양이 모자랍니다.");
        }

        this.leftAmount -= 10;
        System.out.println("버섯 왼쪽의 남은 양 : " + this.leftAmount);

        alice.changeHeight(40);
    }

    public void decreaseRight(Alice alice) {
        if(rightAmount - 10 < 0) {
            throw new IllegalStateException("양이 모자랍니다.");
        }

        this.rightAmount -= 10;
        System.out.println("버섯 오른쪽의 남은 양 : " + this.rightAmount);

        alice.changeHeight(130);
    }
}
