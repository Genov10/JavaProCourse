package edu.hw20_patterns.Factory;

import edu.hw20_patterns.Factory.Furniture.Furniture;
import edu.hw20_patterns.Factory.Furniture.Table;

import java.util.concurrent.Future;

public class TabelFactory implements FurnitureFactory {

    @Override
    public Furniture create() {
        Table table = new Table();
        table.check();
        return table;
    }
}
