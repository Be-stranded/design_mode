package com.duke.pattern.factory.before;

/**
 * 咖啡店
 */
public class CoffeeStore {

    public Coffee orderCoffee(String type) {
        Coffee coffee;
        if ("american".equals(type)) {
            coffee = new AmericanCoffee();
        } else if ("latte".equals(type)) {
            coffee = new LatteCoffee();
        } else {
            throw new RuntimeException("对不起，本店没有您需要点的咖啡");
        }
        // 加配料
        coffee.addMilk();
        coffee.addSugar();

        return coffee;
    }
}
