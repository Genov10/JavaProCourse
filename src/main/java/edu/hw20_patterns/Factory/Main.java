package edu.hw20_patterns.Factory;

import edu.hw20_patterns.Factory.Furniture.Chair;
import edu.hw20_patterns.Factory.Furniture.Furniture;

public class Main {
    public static void main(String[] args) {
        FurnitureFactory tabelFactory = new TabelFactory();
        FurnitureFactory chairFactory = new ChairFactory();

            tabelFactory.create();
            chairFactory.create();
    }
}
