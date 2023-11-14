package edu.hw20_patterns.Factory;

import edu.hw20_patterns.Factory.Furniture.Chair;
import edu.hw20_patterns.Factory.Furniture.Furniture;


public class ChairFactory implements FurnitureFactory {
    public Furniture create() {
        Chair chair = new Chair();
        chair.check();
        return chair;
    }
}
