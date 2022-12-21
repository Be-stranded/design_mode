package com.duke.pattern.factory.before;

public class Client {

    public static void main(String[] args) {
        CoffeeStore store = new CoffeeStore();
        Coffee coffee = store.orderCoffee("latte");
        coffee.getName();
    }
}
