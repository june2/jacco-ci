package com.refactoring.kt

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class FirstBasePriceTest {

    @Test
    internal fun `'price test'`() {
        val firstBasePrice = FirstBasePrice(1000, 2)

        var restult = firstBasePrice.getPrice()
        Assertions.assertEquals(restult, 1900.0)
    }
}