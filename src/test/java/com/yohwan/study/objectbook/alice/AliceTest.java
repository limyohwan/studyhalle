package com.yohwan.study.objectbook.alice;

import com.yohwan.study.objectbook.trump.TrumpShape;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.*;
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

    @Test
    void startsWith() {
        String name = "Alice";

        assertThat(name).startsWith("Ali");
    }

    @Test
    void endsWith() {
        String name = "Alice";

        assertThat(name).endsWith("ce");
    }

    @Test
    void contains() {
        String name = "Alice";

        assertThat(name).contains("ic");
    }

    @Test
    void matches() {
        String name = "Alice";

        assertThat(name).matches(".....");
    }

    @Test
    void collectionContains() {
        TrumpShape[] shapes = TrumpShape.values();
        List<TrumpShape> shapeList = Arrays.stream(shapes).collect(Collectors.toList());

        assertThat(shapes).contains(TrumpShape.CLOVER);
        assertThat(shapeList).contains(TrumpShape.CLOVER);
    }

    @Test
    void containsExactly() {
        TrumpShape[] shapes = TrumpShape.values();
        List<TrumpShape> shapeList = Arrays.stream(shapes).collect(Collectors.toList());

        assertThat(shapes).containsExactly(TrumpShape.SPADE, TrumpShape.HEART, TrumpShape.DIAMOND, TrumpShape.CLOVER);
        assertThat(shapeList).elements(0,1,2,3).contains(TrumpShape.SPADE, TrumpShape.HEART, TrumpShape.DIAMOND, TrumpShape.CLOVER);
    }

    @Test
    void hasSize() {
        TrumpShape[] shapes = TrumpShape.values();
        List<TrumpShape> shapeList = Arrays.stream(shapes).collect(Collectors.toList());

        assertThat(shapes).hasSize(shapes.length);
        assertThat(shapeList).hasSize(shapeList.size());
    }

    @Test
    void isEmpty() {
        List<Object> emptyList = List.of();
        TrumpShape[] shapes = TrumpShape.values();
        List<TrumpShape> shapeList = Arrays.stream(shapes).collect(Collectors.toList());

        assertThat(emptyList).isEmpty();
        assertThat(shapes).isNotEmpty();
        assertThat(shapeList).isNotEmpty();
    }

    @Test
    void exceptionIsInstanceOf() {
        int height = 160;
        Place passage = Place.PASSAGE;
        Alice alice = new Alice(height, passage);

        Throwable thrown = catchThrowable(() -> alice.pass(new Door(120)));
        assertThat(thrown).isInstanceOf(IllegalStateException.class);

        assertThatExceptionOfType(IllegalStateException.class)
                .isThrownBy(() -> alice.pass(new Door(120)))
                .isInstanceOf(IllegalStateException.class);
    }

    @Test
    void hasMessage() {
        int height = 160;
        Place passage = Place.PASSAGE;
        Alice alice = new Alice(height, passage);

        Throwable thrown = catchThrowable(() -> alice.pass(new Door(120)));
        assertThat(thrown).hasMessage("키가 40보다 작아야합니다.");
    }
}