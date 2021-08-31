package main.java;

import java.util.concurrent.Phaser;

public class Water {

    Phaser phaser = new Phaser(3);

    public static void main(String[] args) {
        new Water().makeWater();
    }

    private void makeWater() {
        for (int phase = 0; phase < 3; phase++) {
            new Hydrogen(phaser);
            new Hydrogen(phaser);
            new Oxygen(phaser);
            phaser.arriveAndAwaitAdvance();

        }
    }
}
