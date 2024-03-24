package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import static com.example.LottePizza.pizza;

public class LottePizzaTest_AllUses {
    @Test
    public void AllUses_TestPrice1() {
        assertEquals(-1, pizza(12));
    }

    @Test
    public void AllUses_TestPrice2() {
        assertEquals(100, pizza(2));
    }

    @Test
    public void AllUses_TestPrice3() {
        assertEquals(240, pizza(5));
    }

    @Test
    public void AllUses_TestPrice4() {
        assertEquals(340, pizza(8));
    }

}
