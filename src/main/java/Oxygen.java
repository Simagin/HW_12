package main.java;

import java.util.concurrent.Phaser;

public class Oxygen extends Thread {
    Phaser phaser;

    public Oxygen(Phaser phaser) {
        this.phaser = phaser;
        start();
    }

    public void releaseOxygen() {
        System.out.print("O");
    }

    @Override
    public void run() {
        releaseOxygen();
        phaser.arriveAndAwaitAdvance();
    }
}
