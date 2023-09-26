package edu.hw13_dictionaries.coffee.order;

public class Order {
    private int orderNumber;
    private String costumer;

    public Order(String costumer) {
        this.costumer = costumer;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getCostumer() {
        return costumer;
    }

    public void setCostumer(String costumer) {
        this.costumer = costumer;
    }
}
