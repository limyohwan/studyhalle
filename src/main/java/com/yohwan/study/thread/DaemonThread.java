package com.yohwan.study.thread;

import lombok.SneakyThrows;

public class DaemonThread {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Thread thread = new Thread(new Runnable() {
            @SneakyThrows
            @Override
            public void run() {
                Thread.sleep(10000L);
                System.out.println(Thread.currentThread().getName());
            }
        });
        thread.setDaemon(true); // 데몬쓰레드를 true로 하게 되면 메인쓰레드(부모쓰레드)가 종료시 쓰레드가 같이 종료하게됨
        thread.start();
    }
}