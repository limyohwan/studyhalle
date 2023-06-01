package com.yohwan.study.stack;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListNodeStackTest {
    @Test
    void push() {
        ListNodeStack listNodeStack = new ListNodeStack();
        int pushed = 1;
        listNodeStack.push(1);
        listNodeStack.push(2);
        listNodeStack.push(3);
        listNodeStack.push(4);
        Assertions.assertThat(listNodeStack.getSize()).isEqualTo(4);
    }

    @Test
    void pop() {
        ListNodeStack listNodeStack = new ListNodeStack();
        listNodeStack.push(1);
        listNodeStack.push(2);
        listNodeStack.push(3);

        int popped = listNodeStack.pop();
        Assertions.assertThat(popped).isEqualTo(3);
        Assertions.assertThat(listNodeStack.getSize()).isEqualTo(2);

        int popped2 = listNodeStack.pop();
        Assertions.assertThat(popped2).isEqualTo(2);
        Assertions.assertThat(listNodeStack.getSize()).isEqualTo(1);

        int popped3 = listNodeStack.pop();
        Assertions.assertThat(popped3).isEqualTo(1);
        Assertions.assertThat(listNodeStack.getSize()).isEqualTo(0);
    }
}