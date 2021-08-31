package main.java;

import java.util.concurrent.Phaser;

public class Hydrogen extends Thread {
    Phaser phaser;

    public Hydrogen(Phaser phaser) {
        this.phaser = phaser;
        start();
    }
    public void releaseHydrogen(){
        System.out.print("H");
    }

    @Override
    public void run() {
        releaseHydrogen();
        phaser.arriveAndAwaitAdvance();
    }
}