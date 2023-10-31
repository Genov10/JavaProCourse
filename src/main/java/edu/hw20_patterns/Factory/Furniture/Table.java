package edu.hw20_patterns.Factory.Furniture;

import edu.hw20_patterns.Factory.Furniture.Furniture;

public class Table implements Furniture {
    public Table() {
        System.out.println("A table was created");
    }

    public void check() {
        System.out.println("the table is ok");
    }
}
