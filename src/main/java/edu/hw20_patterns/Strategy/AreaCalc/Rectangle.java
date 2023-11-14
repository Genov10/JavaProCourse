package edu.hw20_patterns.Strategy.AreaCalc;

import edu.hw20_patterns.Strategy.AreaCalc.AreaCalc;

public class Rectangle implements AreaCalc {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public double calc() {
        return length*width;
    }
}
