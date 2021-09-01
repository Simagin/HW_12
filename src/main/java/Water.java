package main.java;

import java.util.concurrent.Phaser;

public class Water {

    Phaser Phaser = new Phaser(4);
    static String INPUUT = "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH";

    public static void main(String[] args) {

        new Water().makeWater();
    }

    private void makeWater() {
        for (int phase = 0; phase < INPUUT.length() / 3; phase++) {
            new Hydrogen(Phaser);
            new Hydrogen(Phaser);
            new Oxygen(Phaser);
            Phaser.arriveAndAwaitAdvance();
            System.out.println(" ");
        }
    }
}

