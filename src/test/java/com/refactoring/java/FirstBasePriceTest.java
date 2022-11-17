package com.refactoring.java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FirstBasePriceTest {

    @Test
    @DisplayName("basePrice 1000 이상일때")
    void over1000() {
        com.refactoring.java.FirstBasePrice firstBasePrice = new FirstBasePrice(1000, 2);
        double result = firstBasePrice.getPrice();
        Assertions.assertEquals(result, 1900);
    }

    @Test
    @DisplayName("basePrice 1000 이하일때")
    void under1000() {
        com.refactoring.java.FirstBasePrice firstBasePrice = new FirstBasePrice(10, 2);
        double result = firstBasePrice.getPrice();
        Assertions.assertEquals(result, 19.6);
    }
}
