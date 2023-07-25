package com.yohwan.study.generictest;

public class GenericArray<T> {
    private T[] array;

    public GenericArray(int size) {
//        this.array = new T[size]; // Type parameter 'T' cannot be instantiated directly
        this.array = (T[]) new Object[size];
    }
}
