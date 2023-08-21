package edu.hw5_polymorphism.Interfaces;

public interface Figure {
    double getFigureArea();
    static double calculateTotalArea(Figure[] shapes) {
        double totalArea = 0.0;
        for (Figure shape : shapes) {
            totalArea += shape.getFigureArea();
        }
        return totalArea;
    }
}
