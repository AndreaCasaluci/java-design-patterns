package org.andrea.adapters;

import org.andrea.round.RoundPeg;
import org.andrea.square.SquarePeg;

/**
 * Adapter allows fitting square pegs into round holes.
 */
public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        // Calculate the minimum circle radius that can fit the square peg
        return (Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2));
    }
}
