package com.refactoring.java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FirstBasePriceTest {

    @Test
    @DisplayName("1000")
    void getPriceTest() {
        com.refactoring.java.FirstBasePrice firstBasePrice = new FirstBasePrice(1000, 2);
        double result = firstBasePrice.getPrice();
        Assertions.assertEquals(result, 1900);
    }
}
