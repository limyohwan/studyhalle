package com.yohwan.study.codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int hamburgerCount = Integer.parseInt(br.readLine());
        String[] mealTime = br.readLine().split(" ");
        String[] heatTime = br.readLine().split(" ");

        List<Hamburger> hamburgers = new ArrayList<>();

        for(int i = 0; i < hamburgerCount; i++) {
            hamburgers.add(new Hamburger(Integer.parseInt(mealTime[i]), Integer.parseInt(heatTime[i])));
        }
    }

    static class Hamburger {
        int mealTime;
        int heatTime;

        Hamburger(int mealTime, int heatTime) {
            this.mealTime = mealTime;
            this.heatTime = heatTime;
        }
    }

}
