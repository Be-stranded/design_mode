package com.duke.pattern.factory.simple;


/**
 * 咖啡店
 */
public class CoffeeStore {

    public Coffee orderCoffee(String type) {
        SimpleCoffeeFactory factory = new SimpleCoffeeFactory();
        Coffee coffee = factory.createCoffee(type);

        // 加配料
        coffee.addMilk();
        coffee.addSugar();

        return coffee;
    }
}
