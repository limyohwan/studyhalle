package com.yohwan.study.queue;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Queue {
    private Integer[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Queue() {
        this.elements = new Integer[DEFAULT_INITIAL_CAPACITY];
    }

    public void add(int element) {
        if(elements.length == size) {
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
        elements[size++] = element;
    }

    public int remove() {
        if(size == 0) {
            throw new EmptyStackException();
        }

        int result = elements[0];
        for(int i = 1; i < size; i++){
            elements[i-1] = elements[i];
        }
        elements[--size] = null;
        return result;
    }

    public int element() {
        if(size == 0) {
            throw new EmptyStackException();
        }

        return elements[0];
    }

    public int getSize(){
        return this.size;
    }
}
