package edu.hw20_patterns.Strategy;

import edu.hw20_patterns.Strategy.AreaCalc.AreaCalc;
import edu.hw20_patterns.Strategy.AreaCalc.Rectangle;
import edu.hw20_patterns.Strategy.AreaCalc.Triangle;

public class Main {
    public static void main(String[] args) {
        Figure figure = new Figure();
        AreaCalc triangle = new Triangle(2, 6);
        AreaCalc rectangle = new Rectangle(4, 5);
        System.out.println("Area of a triangle equals to " + figure.calcArea(triangle));
        System.out.println("Area of a rectangle equals to " + figure.calcArea(rectangle));
    }
}
