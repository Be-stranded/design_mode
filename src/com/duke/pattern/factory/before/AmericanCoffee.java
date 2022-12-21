package com.duke.pattern.factory.before;

/**
 * 美式咖啡
 */
public class AmericanCoffee extends Coffee {
    @Override
    public void getName() {
        System.out.println("AmericanCoffee");
    }
}
