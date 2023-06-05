package com.yohwan.study.inheritance;

public class ChildClass extends ParentClass{
    private int childNum = 40;
    private String sameName = "same child";
    private String childCtorStr;

    public ChildClass(String childCtorStr) {
        super("parentCtor");
        this.childCtorStr = childCtorStr;
    }

    public void showParent() {
//        System.out.println(super.parentNum); //private은 접근 불가
        System.out.println(super.parentNum2); // 같은 패키지일 때는 접근가능하지만 다른 패키지일 시 접근 불가
        System.out.println(super.parentNum3);
        System.out.println(super.parentNum4);
//        System.out.println(super.childNum); // 자기는 this로 호출
    }

    public void showChild() {
//        System.out.println(this.parentNum); //private은 접근 불가
        System.out.println(this.parentNum2); // 같은 패키지일 때는 접근가능하지만 다른 패키지일 시 접근 불가
        System.out.println(this.parentNum3);
        System.out.println(this.parentNum4);
        System.out.println(this.childNum);
    }

    public void showSame() {
        String sameName = "same local";

        System.out.println(super.sameName);
        System.out.println(this.sameName);
        System.out.println(sameName);
    }

    public void showCtorStr(){
        System.out.println(super.getParentCtorStr());
        System.out.println(this.childCtorStr);
    }

    public static void showFamily() {
//        System.out.println(this.childNum); 사용 불가
//        System.out.println(super.parentNum2); 사용 불가
    }

    @Override
    public void callMyName() {
        System.out.println(this.getClass().toString());
    }

//    @Override
//    public void notOverrideMethod() {
//        System.out.println("i want override");
//    }

    public static void main(String[] args) {
        ParentClass parentClass = new ParentClass("parentCtor");
        parentClass.callMyName();
        ChildClass childClass = new ChildClass("childCtor");
//        childClass.showParent();
//        childClass.showChild();
//        childClass.showSame();
//        childClass.showCtorStr();
        childClass.callMyName();
    }
}
