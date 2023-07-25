package com.yohwan.study.games;

import java.util.Random;

public class RandomGame {

    public static void main(String[] args) {
        Random random = new Random();
        int congratulation = random.nextInt(200) + 1;
        System.out.println(congratulation);
    }
}
