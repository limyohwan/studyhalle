package com.yohwan.study.codingtest;

public class Solution2 {
    public long solution(long n) {
        long answer = 0;

        for(long i = 1; i < n; i++) {
            long quotient = i * n;
            long remainder = i;
            answer += (quotient + remainder);
        }

        return answer;
    }
}
