package com.yohwan.study.objectbook.trial;

public interface Judge {
    Witness requestToCall(Caller caller);
    void requestToTestify(Witness witness);
}
