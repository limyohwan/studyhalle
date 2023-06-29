package com.yohwan.study.objectbook.trial;

public class Rabbit implements Caller {
    @Override
    public boolean call(Witness witness) {
        System.out.println("증인 등장하시오");
        return witness.appear();
    }
}
