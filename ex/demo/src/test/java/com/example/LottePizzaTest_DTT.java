package com.example;

import static org.junit.Assert.assertEquals;
import static com.example.LottePizza.price;

import org.junit.Test;

public class LottePizzaTest_DTT {
    @Test
    public void DTT_TestPrice1() {
        assertEquals(-1, price(-1,-1));
    }

    @Test
    public void DTT_TestPrice2() {
        assertEquals(-1, price(-1, 2));
    }

    @Test
    public void DTT_TestPrice3() {
        assertEquals(-1, price(-1,8));
    }

    @Test
    public void DTT_TestPrice4() {
        assertEquals(-1, price(-1,11));
    }

    @Test
    public void DTT_TestPrice5() {
        assertEquals(-1, price(2,-1));
    }

    @Test
    public void DTT_TestPrice6() {
        assertEquals(140, price(2,2));
    }

    @Test
    public void DTT_TestPrice7() {
        assertEquals(230, price(2, 8));
    }
    
    @Test
    public void DTT_TestPrice8() {
        assertEquals(-1, price(2,11));
    }

    @Test
    public void DTT_TestPrice9() {
        assertEquals(-1, price(7,-1));
    }

    @Test
    public void DTT_TestPrice10() {
        assertEquals(360, price(7, 2));
    }

    @Test
    public void DTT_TestPrice11() {
        assertEquals(450, price(7,8));
    }

    @Test
    public void DTT_TestPrice12() {
        assertEquals(-1, price(7,11));
    }
    
    @Test
    public void DTT_TestPrice13() {
        assertEquals(-1, price(9,-1));
    }
    
    @Test
    public void DTT_TestPrice14() {
        assertEquals(400, price(9, 2));
    }
    
    @Test
    public void DTT_TestPrice15() {
        assertEquals(490, price(9, 8));
    }
    
    @Test
    public void DTT_TestPrice16() {
        assertEquals(-1, price(9,11));
    }
    
    @Test
    public void DTT_TestPrice17() {
        assertEquals(-1, price(11,-1));
    }
    
    @Test
    public void DTT_TestPrice18() {
        assertEquals(-1, price(11,2));
    }
    
    @Test
    public void DTT_TestPrice19() {
        assertEquals(-1, price(11,8));
    }
    
    @Test
    public void DTT_TestPrice20() {
        assertEquals(-1, price(11,11));
    }
}




