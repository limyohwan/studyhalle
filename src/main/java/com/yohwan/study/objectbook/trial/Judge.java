package com.yohwan.study.objectbook.trial;

public interface Judge {
    boolean requestToCall(Caller caller, Witness witness);
    void requestToTestify(Witness witness);
}
