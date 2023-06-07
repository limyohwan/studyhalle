package com.yohwan.study.queue;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ListNodeQueueTest {

    @Test
    void add() {
        ListNodeQueue listNodeQueue = new ListNodeQueue();
        listNodeQueue.add(1);
        listNodeQueue.add(2);
        listNodeQueue.add(3);
        listNodeQueue.add(4);
        Assertions.assertThat(listNodeQueue.getSize()).isEqualTo(4);
    }

    @Test
    void remove() {
        ListNodeQueue listNodeQueue = new ListNodeQueue();
        listNodeQueue.add(1);
        listNodeQueue.add(2);
        listNodeQueue.add(3);

        int removed = listNodeQueue.remove();
        Assertions.assertThat(removed).isEqualTo(1);
        Assertions.assertThat(listNodeQueue.getSize()).isEqualTo(2);

        int removed2 = listNodeQueue.remove();
        Assertions.assertThat(removed2).isEqualTo(2);
        Assertions.assertThat(listNodeQueue.getSize()).isEqualTo(1);

        int removed3 = listNodeQueue.remove();
        Assertions.assertThat(removed3).isEqualTo(3);
        Assertions.assertThat(listNodeQueue.getSize()).isEqualTo(0);
    }

    @Test
    void element() {
        ListNodeQueue listNodeQueue = new ListNodeQueue();
        listNodeQueue.add(1);
        Assertions.assertThat(listNodeQueue.element()).isEqualTo(1);
        listNodeQueue.add(2);
        Assertions.assertThat(listNodeQueue.element()).isEqualTo(1);
        listNodeQueue.add(3);
        Assertions.assertThat(listNodeQueue.element()).isEqualTo(1);
    }
}