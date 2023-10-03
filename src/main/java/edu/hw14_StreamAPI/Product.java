package edu.hw14_StreamAPI;

import java.time.LocalDateTime;

public class Product {
    private String name;
    private String type;
    private double price;
    private double percentOfDiscount;
    private LocalDateTime dateOfAdd;

    public Product(String name, String type, double price, LocalDateTime dateOfAdd) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.dateOfAdd = dateOfAdd;
    }
    public Product(String name, String type, double price, double percentOfDiscount, LocalDateTime dateOfAdd) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.percentOfDiscount = percentOfDiscount;
        this.dateOfAdd = dateOfAdd;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public double getPercentOfDiscount() {
        return percentOfDiscount;
    }

    public LocalDateTime getDateOfAdd() {
        return dateOfAdd;
    }
}
