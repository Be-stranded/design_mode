package com.duke.pattern.proxy.static_proxy;

/**
 * 火车站
 */
public class TrainStation implements SellTickets {
    @Override
    public void sell() {
        System.out.println("火车站卖票");
    }
}
