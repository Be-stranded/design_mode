package com.duke.pattern.decorator;

/**
 * 鸡蛋类
 */
public class Egg extends Garnish {
    public Egg(FastFood fastFood) {
        super(fastFood, 1, "鸡蛋");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
