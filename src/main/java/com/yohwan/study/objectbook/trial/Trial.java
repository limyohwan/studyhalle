package com.yohwan.study.objectbook.trial;

import com.yohwan.study.objectbook.trump.TrumpKind;
import com.yohwan.study.objectbook.trump.TrumpShape;

import java.util.LinkedList;

public class Trial {
    public static void main(String[] args) {
        King king = new King(TrumpKind.KING, TrumpShape.HEART);

        LinkedList<Witness> witnesses = new LinkedList<>();
        Hatter hatter = new Hatter();
        witnesses.offer(hatter);

        Rabbit rabbit = new Rabbit(witnesses);

        Witness witness = king.requestToCall(rabbit);
        king.requestToTestify(witness);

        Witness witness2 = king.requestToCall(rabbit, hatter);
        king.requestToTestify(witness2);
    }
}
