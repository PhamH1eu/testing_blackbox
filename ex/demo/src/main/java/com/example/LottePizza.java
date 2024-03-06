package com.example;

public class LottePizza {

    public static int pizza(int x) {
        if (x <= 4) {
            return x * 50;
        } else if (x <= 7) {
            return 4 * 50 + (x - 4) * 40;
        } else {
            return 4 * 50 + 3 * 40 + (x - 7) * 20;
        }
    }

    public static int coca(int x) {
        if (x <= 5) {
            return x * 20;
        } else {
            return 5 * 20 + (x - 5) * 10;
        }
    }

    public static int price(int x, int y) {
        if (x <= 0 || x > 10 || y <= 0 || y > 10)
            return -1;
        return pizza(x) + coca(y);
    }

}