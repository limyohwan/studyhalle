package com.yohwan.study.stack;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack {
    private Integer[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack() {
        this.elements = new Integer[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(int element) {
        if(elements.length == size) {
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
        elements[size++] = element;
    }

    public int pop() {
        if(size == 0) {
            throw new EmptyStackException();
        }

        int result = elements[--size];
        elements[size] = null;
        return result;
    }

    public int getSize(){
        return this.size;
    }
}
