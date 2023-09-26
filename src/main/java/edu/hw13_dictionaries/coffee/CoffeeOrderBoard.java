package edu.hw13_dictionaries.coffee;

import edu.hw13_dictionaries.coffee.order.Order;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CoffeeOrderBoard {
    List<Order> listOfOrder = new ArrayList<Order>();
    private int valueOfOrder;

    public void add(Order newOrder) {
        listOfOrder.add(newOrder);
        newOrder.setOrderNumber(valueOfOrder);
        valueOfOrder++;
        System.out.println("Order has added to the queue!");
    }

    public void draw() {
        System.out.println("\n-------------------------------------------");
        for (Order order : listOfOrder) {
            System.out.println(order.getOrderNumber() + " | " + order.getCostumer());
        }
        System.out.println("-------------------------------------------\n");
    }

    public void deliver() {
        if (!listOfOrder.isEmpty()) {
            Order order = listOfOrder.remove(0);
            System.out.println("\nOrder " + order.getOrderNumber() + " was issued");
        } else {
            System.out.println("\nAny order to deliver");
        }
    }

    public void deliver(int selectedOrder) {
        Iterator<Order> iterator = listOfOrder.iterator();
        while (iterator.hasNext()) {
            Order order = iterator.next();
            if (order.getOrderNumber() == selectedOrder) {
                System.out.println("\nOrder " + order.getOrderNumber() + " was issued");
                iterator.remove(); // Видалити поточний елемент
                return; // Завершити після видалення
            }
        }
        System.out.println("\nThis order doesn't exist");
    }


}
