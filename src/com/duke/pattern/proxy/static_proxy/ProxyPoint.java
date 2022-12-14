package com.duke.pattern.proxy.static_proxy;

/**
 * 代售点类
 */
public class ProxyPoint implements SellTickets {

    // 声明火车站对象
    private final TrainStation trainStation = new TrainStation();

    @Override
    public void sell() {
        System.out.println("代售点收取一些费用");
        trainStation.sell();
    }
}
