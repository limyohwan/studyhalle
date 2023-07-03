package com.yohwan.study.thread;

public class ThreadImpl implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        ThreadImpl thread = new ThreadImpl();
        new Thread(thread).start();
    }
}
