package com.yohwan.study.objectbook.trial;

import com.yohwan.study.objectbook.trump.TrumpKind;
import com.yohwan.study.objectbook.trump.TrumpPerson;
import com.yohwan.study.objectbook.trump.TrumpShape;

import java.util.SortedMap;

public class King extends TrumpPerson implements Judge {
    public King(TrumpKind kind, TrumpShape shape) {
        super(kind, shape);
    }

    @Override
    public boolean requestToCall(Caller caller, Witness witness) {
        System.out.println("진행자야 증인을 불러와라");
        return caller.call(witness);
    }

    @Override
    public void requestToTestify(Witness witness) {
        System.out.println("증언해라");
        witness.testify();
    }

    public static void main(String[] args) {
        King king = new King(TrumpKind.KING, TrumpShape.HEART);
        Rabbit rabbit = new Rabbit();
        Hatter hatter = new Hatter();

        if(king.requestToCall(rabbit, hatter)) {
            king.requestToTestify(hatter);
        } else {
            System.out.println("증인이 없으니 재판을 종료한다");
        }
    }
}
