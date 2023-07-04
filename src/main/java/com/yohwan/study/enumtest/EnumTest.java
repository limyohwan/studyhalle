package com.yohwan.study.enumtest;

public class EnumTest {
    enum MyEnum {
        YOHWAN("yohwan"), LIM("LIM");
        private String text;

        MyEnum(String text) {
            this.text = text;
        }

        public String getText() {
            return text;
        }
    }

    public static void main(String[] args) {
        EnumTest enumTest = new EnumTest();
        enumTest.print(MyEnum.YOHWAN);

        // 나는 "yohwan"과 "LIM"만 받고싶은데 아무문자열을 받을 수 있게됨
        // 이런걸 타입세이프하지 않다고함
        // 이걸 제한할수 있는 것이 enum임
        enumTest.print("아무문자열");
    }

    private void print(MyEnum myEnum) {
        System.out.println(myEnum.getText());
    }

    private void print(String str) {
        System.out.println(str);
    }
}
