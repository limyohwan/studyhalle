package com.yohwan.study.generictest;

public class SuperPlay<T> {
    public static void main(String[] args) {
        SuperPlay<? super LoL> lolPlay = new SuperPlay<>();
        lolPlay.doSomething(new SuperPlay<LoL>());
        lolPlay.doSomething(new SuperPlay<Game>());
        lolPlay.doSomething(new SuperPlay<RankGame>()); // super에 interface도 가능
    }

    public void doSomething(SuperPlay<? super LoL> play) {// super는 파라미터에서는 가능
        System.out.println(play);
    }
}
