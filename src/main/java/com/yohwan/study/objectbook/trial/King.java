package com.yohwan.study.objectbook.trial;

import com.yohwan.study.objectbook.trump.TrumpKind;
import com.yohwan.study.objectbook.trump.TrumpPerson;
import com.yohwan.study.objectbook.trump.TrumpShape;

import java.util.LinkedList;
import java.util.SortedMap;

public class King extends TrumpPerson implements Judge {
    public King(TrumpKind kind, TrumpShape shape) {
        super(kind, shape);
    }

    @Override
    public Witness requestToCall(Caller caller) {
        System.out.println("진행자야 증인을 불러와라");
        return caller.call();
    }

    @Override
    public Witness requestToCall(Caller caller, Witness witness) {
        System.out.println("진행자야 증인을 불러와라");
        return caller.call(witness);
    }

    @Override
    public void requestToTestify(Witness witness) {
        System.out.println("증언해라");
        witness.testify();
    }
}
