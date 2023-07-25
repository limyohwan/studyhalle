package com.yohwan.study.generictest.game;

public class Play<T extends RankGame> { // extends지만 interface도 똑같이 동작함

    public static void main(String[] args) {
        Play<LoL> loLPlay = new Play<>();
//        Play<WoW> woWPlay = new Play<>(); // Wow는 RankGame의 구현체가 아니므로 안됨

    }

}
