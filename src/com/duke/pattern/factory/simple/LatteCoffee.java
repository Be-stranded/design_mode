package com.duke.pattern.factory.simple;

/**
 * 拿铁咖啡
 */
public class LatteCoffee extends Coffee {
    @Override
    public void getName() {
        System.out.println("拿铁");
    }
}
