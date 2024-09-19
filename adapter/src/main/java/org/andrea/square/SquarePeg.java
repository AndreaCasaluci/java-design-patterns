package org.andrea.square;

/**
 * SquarePegs are not compatible with RoundHoles (they were implemented by
 * previous developement team). But we have to integrate them into our system
 * since they are already in production.
 */
public class SquarePeg {
    private double width;

    public SquarePeg(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getSquare() {
        return Math.pow(this.width, 2);
    }
}
