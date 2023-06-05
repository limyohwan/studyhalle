package com.yohwan.study.finalkeyword;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FinalKeyword {
    private final int number;

    public FinalKeyword() {
        this.number = 10;
    }

    public int getNumber() {
        return number;
    }

//    public void setNumber(int number){
//        this.number = number;
//    }

//    public void changeNumber(final int number) {
//        number = 10;
//    }

    public static void main(String[] args) {
        FinalKeyword finalKeyword = new FinalKeyword();
//        System.out.println(finalKeyword.getNumber());
        final List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3));
        System.out.println(numbers); // [1, 2, 3]

        numbers.add(4);
        System.out.println(numbers); // [1, 2, 3, 4]
    }
}
