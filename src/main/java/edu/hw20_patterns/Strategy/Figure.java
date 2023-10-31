package edu.hw20_patterns.Strategy;

import edu.hw20_patterns.Strategy.AreaCalc.AreaCalc;

public class Figure {
    public double calcArea(AreaCalc areaCalc) {
        return areaCalc.calc();
    }

}
