package edu.hw5_polymorphism.Interfaces;

public class Main {
    public static void main(String[] args) {
        Figure[] shapes = new Figure[] {
                new Circle(5.0),
                new Triangle(7.0, 4.0),
                new Square(5.0)
        };
        double totalArea = Figure.calculateTotalArea(shapes);
        String roundedTotalArea = String.format("%.2f",totalArea);
        System.out.println("Total area of all figure: " + roundedTotalArea);
    }
}
