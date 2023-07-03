package com.yohwan.study.thread;

public class SynchronizedKeyword {
    public synchronized void synchronizedMethod() {
        System.out.println("synchronized method");
    }

    public void synchronizedBlock() {
        synchronized (this) {
            System.out.println("synchronized block");
        }
    }
}
