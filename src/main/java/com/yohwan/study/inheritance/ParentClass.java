package com.yohwan.study.inheritance;

public class ParentClass {
    private int parentNum = 10;
    int parentNum2 = 20;
    public int parentNum3 = 30;
    protected int parentNum4 = 40;
    public String sameName = "same parent";
    private String parentCtorStr;

    public ParentClass(String parentCtorStr) {
        this.parentCtorStr = parentCtorStr;
    }

    public String getParentCtorStr() {
        return parentCtorStr;
    }

    public void callMyName() {
        System.out.println(this.getClass().toString());
    }
}
