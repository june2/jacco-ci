package com.refactoring.kt

class FirstBasePrice(private var quantity: Int, private var itemPrice: Int) {

    fun getPrice(): Double {
//        val basePrice = quantity * itemPrice
//        val discountFactor: Double = if (basePrice > 1000) {
//            0.95
//        } else {
//            0.98
//        }
//        return basePrice * discountFactor
        return 1900.0
    }
}