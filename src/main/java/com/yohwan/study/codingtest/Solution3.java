package com.yohwan.study.codingtest;

public class Solution3 {
    public int solution(int[] histogram) {
        int answer = -1;

        for(int i = 0; i < histogram.length - 1; i++) {
            for(int j = 1; j < histogram.length; j++) {
                if(hasLength(i, j)) {
                    int length = j - i - 1;
                    int height = Math.min(histogram[i], histogram[j]);
                    int area = length * height;

                    if(answer <= area) {
                        answer = area;
                    }
                }
            }
        }

        return answer;
    }

    private boolean hasLength(int i, int j) {
        return j - i != 1;
    }
}