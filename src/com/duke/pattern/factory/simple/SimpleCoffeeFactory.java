package com.duke.pattern.factory.simple;

/**
 * 简单咖啡工厂
 */
public class SimpleCoffeeFactory {

    public Coffee createCoffee(String type) {
        Coffee coffee;
        if ("american".equals(type)) {
            coffee = new AmericanCoffee();
        } else if ("latte".equals(type)) {
            coffee = new LatteCoffee();
        } else {
            throw new RuntimeException("对不起，本店没有您需要点的咖啡");
        }

        return coffee;
    }
}
