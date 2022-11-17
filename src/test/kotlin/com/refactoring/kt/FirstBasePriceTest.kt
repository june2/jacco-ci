package com.refactoring.kt

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class FirstBasePriceTest {

    @Test
    internal fun `basePrice 1000 이상일때`() {
        val firstBasePrice = FirstBasePrice(1000, 2)
        var restult = firstBasePrice.getPrice()
        Assertions.assertEquals(restult, 1900.0)
    }

//    @Test
//    internal fun `basePrice 1000 이하일때`() {
//        val firstBasePrice = FirstBasePrice(10, 2)
//        var restult = firstBasePrice.getPrice()
//        Assertions.assertEquals(restult, 19.6)
//    }
}