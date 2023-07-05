package com.yohwan.study.enumtest;

public enum SimpleExample {
    LIM,YO,HWAN;

    public static void main(String[] args) {
        SimpleExample lim = SimpleExample.valueOf("LIM");
        System.out.println(lim == SimpleExample.LIM); // true

        SimpleExample lim2 = SimpleExample.valueOf("lim"); // IllegalArgumentException
        System.out.println(lim2 == SimpleExample.LIM);
    }
}
