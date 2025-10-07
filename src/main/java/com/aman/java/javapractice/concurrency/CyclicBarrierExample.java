package com.aman.java.javapractice.concurrency;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierExample {

    public static void main(String[] args) {

        // Create a barrier for 3 threads
        CyclicBarrier barrier = new CyclicBarrier(3, () -> {
            // This runs once all 3 threads reach the barrier
            System.out.println("All players finished preparation. Proceeding to next phase...");
        });

        // Create and start 3 worker threads
        for (int i = 1; i <= 3; i++) {
            new Thread(new Player(barrier, i)).start();
        }
    }
}

class Player implements Runnable {

    private CyclicBarrier barrier;
    private int id;

    public Player(CyclicBarrier barrier, int id) {
        this.barrier = barrier;
        this.id = id;
    }

    @Override
    public void run() {
        try {
            System.out.println("Player " + id + " is preparing...");
            Thread.sleep(1000 + (int)(Math.random() * 2000)); // simulate work
            System.out.println("Player " + id + " is ready!");

            // Wait at the barrier until all threads reach it
            barrier.await();

            // Once barrier is crossed, continue work
            System.out.println("Player " + id + " starts the game after all are ready.");

        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}
