package com.duke.pattern.decorator;

/**
 * 装饰类
 */
public abstract class Garnish extends FastFood {
    private final FastFood fastFood;

    public Garnish(FastFood fastFood, float price, String desc) {
        super(price, desc);
        this.fastFood = fastFood;
    }

    @Override
    public float getPrice() {
        return super.getPrice() + fastFood.getPrice();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + fastFood.getDesc();
    }
}
