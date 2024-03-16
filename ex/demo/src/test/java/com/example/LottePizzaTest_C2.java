package com.example;

import static org.junit.Assert.assertEquals;
import static com.example.LottePizza.pizza;

import org.junit.Test;

public class LottePizzaTest_C2 {
    @Test
    public void C2_TestPrice1() {
        assertEquals(-1, pizza(11));
    }

    @Test
    public void C2_TestPrice2() {
        assertEquals(150, pizza(3));
    }

    @Test
    public void C2_TestPrice3() {
        assertEquals(240, pizza(5));
    }

    @Test
    public void C2_TestPrice4() {
        assertEquals(360, pizza(9));
    }

}




