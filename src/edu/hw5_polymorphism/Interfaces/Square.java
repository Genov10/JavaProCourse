package edu.hw5_polymorphism.Interfaces;

public class Square implements Figure {
    private double side;
    public Square(double side){
        this.side = side;
    }
    @Override
    public double getFigureArea() {
        return side * side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
