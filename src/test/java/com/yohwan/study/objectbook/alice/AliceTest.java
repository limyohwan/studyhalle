package com.yohwan.study.objectbook.alice;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.BDDAssertions.then;

class AliceTest {

    @Test
    @Disabled
    void assertThatAs() {

        int height = 160;
        Place passage = Place.PASSAGE;
        Alice alice = new Alice(height, passage);

        assertThat(alice.getHeight()).as("앨리스의 키").isEqualTo(44);

        assertThat(alice.getHeight()).isEqualTo(height);
        then(alice.getHeight()).isEqualTo(height); // BDD style
    }

    @Test
    void assertThatBddStyle() {
        int height = 160;
        Place passage = Place.PASSAGE;
        Alice alice = new Alice(height, passage);

        assertThat(alice.getHeight()).isEqualTo(height);
        then(alice.getHeight()).isEqualTo(height); // BDD style
    }

    @Test
    @Disabled
    void assertThatOverridingErrorMessage() {
        int height = 160;
        Place passage = Place.PASSAGE;
        Alice alice = new Alice(height, passage);

        Alice ali = new Alice(150, Place.BEAUTIFUL_GARDEN);

        assertThat(alice.getHeight()).withFailMessage("should be %s", alice).isEqualTo(ali);
        assertThat(alice.getHeight()).overridingErrorMessage("should be %s", alice).isEqualTo(ali);
    }

    @Test
    @Disabled
    void assertThatLazyOverridingErrorMessage() {
        int height = 160;
        Place passage = Place.PASSAGE;
        Alice alice = new Alice(height, passage);

        assertThat(alice.getPlace() == Place.BEAUTIFUL_GARDEN).withFailMessage(() -> "expecting place is beautiful garden").isTrue();
        assertThat(alice.getPlace() == Place.BEAUTIFUL_GARDEN).overridingErrorMessage(() -> "expecting place is beautiful garden").isTrue();
    }

    @Test
    void isEqualTo() {
        int height = 160;
        Place passage = Place.PASSAGE;
        Alice alice = new Alice(height, passage);

        assertThat(height).isEqualTo(160);
        assertThat(passage).isEqualTo(Place.PASSAGE);
    }

    @Test
    void isNotEqualTo() {
        int height = 160;
        Place passage = Place.PASSAGE;
        Alice alice = new Alice(height, passage);

        assertThat(height).isNotEqualTo(11);
        assertThat(passage).isNotEqualTo(Place.BEAUTIFUL_GARDEN);
    }

    @Test
    void isNull() {
        int height = 160;
        Place passage = Place.PASSAGE;
        Alice alice = new Alice(height, passage);

        assertThat(alice.getKey()).isNull();
    }

    @Test
    void isNotNull() {
        int height = 160;
        Place passage = Place.PASSAGE;
        Alice alice = new Alice(height, passage);
        alice.get(new Key(30));

        assertThat(alice.getKey()).isNotNull();
    }

    @Test
    void isSameAs() {
        int height = 160;
        Place passage = Place.PASSAGE;
        Alice alice = new Alice(height, passage);
        Alice alice2 = alice;

        //Verifies that the actual value is the same as the given one, ie using == comparison.
        assertThat(alice).isSameAs(alice2);
    }

    @Test
    void isNotSameAs() {
        int height = 160;
        Place passage = Place.PASSAGE;
        Alice alice = new Alice(height, passage);
        Alice clone = new Alice(height, passage);

        assertThat(alice).isNotSameAs(clone);
    }

    @Test
    void isInstanceOf() {
        int height = 160;
        Place passage = Place.PASSAGE;
        Alice alice = new Alice(height, passage);

        assertThat(alice).isInstanceOf(Alice.class);
    }

    @Test
    void hasFieldOrProperty() {
        int height = 160;
        Place passage = Place.PASSAGE;
        Alice alice = new Alice(height, passage);

        assertThat(alice).hasFieldOrProperty("height");
        assertThat(alice).hasFieldOrProperty("place");
    }

    @Test
    void hasFieldOrPropertyWithValue() {
        int height = 160;
        Place passage = Place.PASSAGE;
        Alice alice = new Alice(height, passage);

        assertThat(alice).hasFieldOrPropertyWithValue("height", height);
        assertThat(alice).hasFieldOrPropertyWithValue("place", passage);
    }

    @Test
    void extracting() {
        int height = 160;
        Place passage = Place.PASSAGE;
        Alice alice = new Alice(height, passage);

        assertThat(alice).extracting("height", "place")
                .containsExactly(height, passage);
    }

}