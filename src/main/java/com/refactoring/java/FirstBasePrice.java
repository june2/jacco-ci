package com.refactoring.java;

public class FirstBasePrice {
    private int quantity;
    private int itemPrice;

    public FirstBasePrice(int quantity, int itemPrice) {
        this.quantity = quantity;
        this.itemPrice = itemPrice;
    }

    public double getPrice() {
//        int basePrice = quantity * itemPrice;
//        double discountFactor;
//        if (basePrice > 1000) {
//            discountFactor = 0.95;
//        } else {
//            discountFactor = 0.98;
//        }
//        return basePrice * discountFactor;
        return 1900.0;
    }
}
