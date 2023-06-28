package com.yohwan.study.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultiThreadProgramming {
    private static final int NUM_TASKS = 100;

    public static void main(String[] args) throws InterruptedException {
        long startTime, endTime;

        // Single-threaded execution
        startTime = System.currentTimeMillis();
        singleThreadExecution();
        endTime = System.currentTimeMillis();
        System.out.println("Single-threaded execution time: " + (endTime - startTime) + " ms");

        // Multi-threaded execution
        startTime = System.currentTimeMillis();
        multiThreadExecution();
        endTime = System.currentTimeMillis();
        System.out.println("Multi-threaded execution time: " + (endTime - startTime) + " ms");
    }

    private static void singleThreadExecution() {
        List<Integer> results = new ArrayList<>();
        for (int i = 0; i < NUM_TASKS; i++) {
            results.add(processTask(i));
        }
        // Process the results if needed
    }

    private static void multiThreadExecution() throws InterruptedException {
        List<Integer> results = new ArrayList<>();
        ExecutorService executor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        CountDownLatch latch = new CountDownLatch(NUM_TASKS);

        for (int i = 0; i < NUM_TASKS; i++) {
            final int taskId = i;
            executor.execute(() -> {
                int result = processTask(taskId);
                synchronized (results) {
                    results.add(result);
                }
                latch.countDown();
            });
        }

        latch.await();
        executor.shutdown();

        // Process the results if needed
    }

    private static int processTask(int taskId) {
        // Simulate some time-consuming task
        int result = taskId * 2;
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return result;
    }
}
