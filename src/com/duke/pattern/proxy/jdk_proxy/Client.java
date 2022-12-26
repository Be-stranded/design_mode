package com.duke.pattern.proxy.jdk_proxy;

import com.duke.pattern.proxy.static_proxy.SellTickets;

public class Client {

    public static void main(String[] args) {
        // 获取代理对象
        // 1. 创建代理工厂对象
        ProxyFactory factory = new ProxyFactory();
        // 2. 使用 factory 对象的方法获取代理对象
        SellTickets proxyObject = factory.getProxyObject();

        proxyObject.sell();
    }
}
