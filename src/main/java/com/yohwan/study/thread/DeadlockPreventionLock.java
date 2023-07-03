package com.yohwan.study.thread;

import java.util.concurrent.locks.ReentrantLock;

public class DeadlockPreventionLock {
    // ReentrantLock을 사용하여 데드락을 피할 수 있음
    // 각 쓰레드는 lock1과 lock2를 차례대로 잠금하고 작업을 수행한 후에는 잠금을 해제함
    // ReentrantLock은 재진입이 간으하므로 쓰레드가 이미 획득한 잠금을 다시 획득할 수 있음
    private static final ReentrantLock lock1 = new ReentrantLock();
    private static final ReentrantLock lock2 = new ReentrantLock();

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            lock1.lock();
            System.out.println("Thread 1: Holding lock 1...");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread 1: Waiting for lock 2...");
            lock2.lock();
            System.out.println("Thread 1: Holding lock 1 and lock 2...");
            // 동기화된 코드 실행
            lock2.unlock();
            lock1.unlock();
        });

        Thread thread2 = new Thread(() -> {
            lock1.lock();
            System.out.println("Thread 2: Holding lock 1...");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread 2: Waiting for lock 2...");
            lock2.lock();
            System.out.println("Thread 2: Holding lock 1 and lock 2...");
            // 동기화된 코드 실행
            lock2.unlock();
            lock1.unlock();
        });

        thread1.start();
        thread2.start();
    }
}
