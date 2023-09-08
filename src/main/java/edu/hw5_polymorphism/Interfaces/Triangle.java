package edu.hw5_polymorphism.Interfaces;

public class Triangle implements Figure {
    private double baseSide;
    private double height;

    public Triangle(double baseSide, double height) {
        this.baseSide = baseSide;
        this.height = height;
    }
    @Override
    public double getFigureArea() {
        return (baseSide * height)/2;
    }

    public double getBaseSide() {
        return baseSide;
    }

    public void setBaseSide(double baseSide) {
        this.baseSide = baseSide;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
