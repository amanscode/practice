package com.aman.java.javapractice.concurrency;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {
    public static void main(String[] args) throws InterruptedException {
        int numberOfWorkers = 3;
        CountDownLatch latch = new CountDownLatch(numberOfWorkers);

        // Create worker threads
        for (int i = 1; i <= numberOfWorkers; i++) {
            Thread worker = new Thread(new Worker(latch, i));
            worker.start();
        }

        System.out.println("Main thread waiting for workers to finish...");

        // Wait until latch count reaches 0
        latch.await();

        System.out.println("All workers finished. Main thread proceeds.");
    }
}

class Worker implements Runnable {
    private final CountDownLatch latch;
    private final int workerId;

    public Worker(CountDownLatch latch, int workerId) {
        this.latch = latch;
        this.workerId = workerId;
    }

    @Override
    public void run() {
        try {
            System.out.println("Worker " + workerId + " started.");
            Thread.sleep(1000 * workerId); // simulate work
            System.out.println("Worker " + workerId + " finished.");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            latch.countDown(); // decrement count
        }
    }
}
