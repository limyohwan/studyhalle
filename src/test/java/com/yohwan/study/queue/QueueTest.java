package com.yohwan.study.queue;

import com.yohwan.study.stack.Stack;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {

    @Test
    void add() {
        Queue queue = new Queue();
        int added = 1;
        queue.add(added);
        queue.add(added);
        queue.add(added);
        queue.add(added);
        Assertions.assertThat(queue.getSize()).isEqualTo(4);
    }

    @Test
    void remove() {
        Queue queue = new Queue();
        int added = 1;
        queue.add(added);

        int removed = queue.remove();
        Assertions.assertThat(removed).isEqualTo(added);
        Assertions.assertThat(queue.getSize()).isEqualTo(0);
    }

    @Test
    void element() {
        Queue queue = new Queue();
        int added = 1;
        queue.add(added);
        queue.add(2);
        queue.add(3);

        int element = queue.element();
        Assertions.assertThat(element).isEqualTo(added);
    }
}