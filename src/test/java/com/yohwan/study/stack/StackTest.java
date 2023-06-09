package com.yohwan.study.stack;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class StackTest {
    @Test
    void push() {
        Stack stack = new Stack();
        int pushed = 1;
        stack.push(pushed);
        stack.push(pushed);
        stack.push(pushed);
        stack.push(pushed);
        Assertions.assertThat(stack.getSize()).isEqualTo(4);
    }

    @Test
    void pop() {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        int pushed = 3;
        stack.push(pushed);

        int popped = stack.pop();
        Assertions.assertThat(popped).isEqualTo(pushed);
    }
}