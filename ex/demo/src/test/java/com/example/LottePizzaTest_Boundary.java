package com.example;

import static org.junit.Assert.assertEquals;
import static com.example.LottePizza.price;

import org.junit.Test;

public class LottePizzaTest_Boundary {
    @Test
    public void boundary_TestPrice1() {
        assertEquals(340, price(5, 5));
    }

    @Test
    public void boundary_TestPrice2() {
        assertEquals(260, price(5, 1));
    }

    @Test
    public void boundary_TestPrice3() {
        assertEquals(280, price(5, 2));
    }

    @Test
    public void boundary_TestPrice4() {
        assertEquals(380, price(5, 9));
    }

    @Test
    public void boundary_TestPrice5() {
        assertEquals(390, price(5, 10));
    }

    @Test
    public void boundary_TestPrice6() {
        assertEquals(150, price(1, 5));
    }

    @Test
    public void boundary_TestPrice7() {
        assertEquals(200, price(2, 5));
    }
    
    @Test
    public void boundary_TestPrice8() {
        assertEquals(460, price(9, 5));
    }

    @Test
    public void boundary_TestPrice9() {
        assertEquals(480, price(10, 5));
    }
}



