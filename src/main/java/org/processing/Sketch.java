package org.processing;

import processing.core.PApplet;

public class Sketch extends PApplet {

    @Override
    public void settings() {
        size(500, 500);
    }

    @Override
    public void setup() {

    }

    @Override
    public void draw() {
        background(frameCount % 255);
    }

    // helper methods to start processing
    public static void main(String[] args) {
        new Sketch().run();
    }

    public void run() {
        runSketch();
    }
}
