package edu.hw20_patterns.Factory;

import edu.hw20_patterns.Factory.Furniture.Furniture;
import edu.hw20_patterns.Factory.Furniture.Table;

import java.util.concurrent.Future;

interface FurnitureFactory {
    Furniture create();
}
