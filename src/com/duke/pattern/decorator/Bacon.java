package com.duke.pattern.decorator;

/**
 * 培根类
 */
public class Bacon extends Garnish {

    public Bacon(FastFood fastFood) {
        super(fastFood, 2, "培根");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
