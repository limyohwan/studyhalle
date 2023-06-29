package com.yohwan.study.objectbook.trump;

public class TrumpPerson extends Trump implements Person {
    public TrumpPerson(TrumpKind kind, TrumpShape shape) {
        super(kind, shape);
    }

    public static void main(String[] args) {
        TrumpPerson person = new TrumpPerson(TrumpKind.ACE, TrumpShape.CLOVER);
        person.walk();
        person.LieDown();
        person.turnOver();
    }
}
