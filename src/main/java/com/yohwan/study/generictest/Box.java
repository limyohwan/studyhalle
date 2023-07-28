package com.yohwan.study.generictest;

public class Box<T> {
    private T product;

    public void putProduct(T product) {
        this.product = product;
    }

    public T getProduct() {
        return product;
    }

    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.putProduct("hello");
        System.out.println(stringBox.getProduct());

        Box<Integer> integerBox = new Box<>();
//        integerBox.putProduct("hello"); // 컴파일 에러
        integerBox.putProduct(1);
        System.out.println(stringBox.getProduct());
    }
}
