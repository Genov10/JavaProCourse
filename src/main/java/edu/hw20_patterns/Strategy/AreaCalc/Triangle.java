package edu.hw20_patterns.Strategy.AreaCalc;

import edu.hw20_patterns.Strategy.AreaCalc.AreaCalc;

public class Triangle implements AreaCalc {
    private int lowerSide;
    private int height;

    public Triangle(int lowerSide, int height) {
        this.lowerSide = lowerSide;
        this.height = height;
    }

    public double calc() {
        return lowerSide*height;
    }
}
