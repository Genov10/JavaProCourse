package edu.hw5_polymorphism.Interfaces;

public class Circle implements Figure {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double getFigureArea() {
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
