package edu.hw13_dictionaries.coffee;

import edu.hw13_dictionaries.coffee.order.Order;

public class Main {
    public static void main(String[] args) {
        CoffeeOrderBoard orderBoard = new CoffeeOrderBoard();
        orderBoard.add(new Order("Alex"));
        orderBoard.add(new Order("Dima"));
        orderBoard.add(new Order("Lena"));
        orderBoard.add(new Order("Vika"));
        orderBoard.add(new Order("Olexander"));
        orderBoard.add(new Order("Danil"));
        orderBoard.add(new Order("Max"));
        orderBoard.add(new Order("Dan"));
        orderBoard.add(new Order("Kostia"));
        orderBoard.add(new Order("Kostantin"));
        orderBoard.add(new Order("Dima"));
        orderBoard.add(new Order("Nikita"));
        orderBoard.draw();
        orderBoard.deliver();
        orderBoard.deliver();
        orderBoard.draw();
        orderBoard.deliver(11);
        orderBoard.deliver(2);
        orderBoard.deliver(5);
        orderBoard.deliver(0);
        orderBoard.draw();
    }
}
