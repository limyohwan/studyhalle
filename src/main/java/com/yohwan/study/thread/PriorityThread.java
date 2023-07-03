package com.yohwan.study.thread;

public class PriorityThread {
    public static void main(String[] args) {
        ThreadCreation thread = new ThreadCreation();
        thread.setPriority(Thread.MAX_PRIORITY);
        int priority = thread.getPriority();
    }
}
